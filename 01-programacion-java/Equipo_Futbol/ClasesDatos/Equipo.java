package ClasesDatos;

import Comparador.ComparaFutbolistas;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author fosortiiz
 */
public class Equipo {

    private String nombre;
    List<Futbolista> plantilla = new LinkedList();
    Map<Posicion, Integer> maximos = new HashMap();

    public Equipo(String nombre) {
        this.nombre = nombre;
        maximos.put(Posicion.PORTERO, 2);
        maximos.put(Posicion.DEFENSA, 5);
        maximos.put(Posicion.MEDIO, 5);
        maximos.put(Posicion.DELANTERO, 4);
    }

    public void agregarFutbolista(Futbolista futbolista) {
        if (maximos.get(futbolista.posicion) <= cuentaFutbolistas(futbolista.posicion)) {
            throw new RegistroFutbolistaException("No puedo registrar el futbolista,"
                    + "máximo número de " + futbolista.posicion.getNombre()
                    + " alcanzado.");
        }

        futbolista.setEquipos(nombre);
        plantilla.add(futbolista);
    }

    private int cuentaFutbolistas(Posicion posicion) {
        int contador = 0;
        for (Futbolista f : plantilla) {
            if (f.posicion == posicion) {
                contador++;
            }
        }

        return contador;
    }

    public String listarFormacionDelEquipo() {
        String salida = "Plantilla del equipo " + nombre + ":\n";
//        Collections.sort(plantilla);
//        //Opción 1
//        plantilla.sort(new ComparaFutbolistas());

//        //Opción
//        plantilla.sort(new Comparator<Futbolista>(){
//            @Override
//            public int compare(Futbolista o1, Futbolista o2) {
//                return o1.getPosicion().getOrdenListado() - 
//                o2.getPosicion().getOrdenListado();
//            }
//            
//        });
        //Opción 3
        plantilla.sort((f1, f2) -> f2.posicion.ordenListado - f1.posicion.ordenListado);

        for (Futbolista f : plantilla) {
            salida += f + "\n";
        }

        return salida;
    }

}
