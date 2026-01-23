package App_Main;

import ClasesDatos.Equipo;
import ClasesDatos.Futbolista;
import ClasesDatos.Posicion;

/**
 *
 * @author fosortiiz
 */
public class EquipoFutbol {

    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("Messi", 37,
                Posicion.DELANTERO, 5000);

        f1.setEquipos("Barcelona");
        f1.setTrofeos("Balón de oro 2001");

        Futbolista f2 = new Futbolista("Courtois", 33,
                Posicion.PORTERO, 2500);

        f2.setEquipos("Atlético");
        f2.setEquipos("Chelsea");

        Futbolista f3 = new Futbolista("Iker", 44,
                Posicion.PORTERO, 2500);
        f3.setEquipos("Real Madrid");

        Equipo equipo = new Equipo("Recre");

        equipo.agregarFutbolista(f1);

        equipo.agregarFutbolista(f2);
        equipo.agregarFutbolista(f3);

        System.out.println(equipo.listarFormacionDelEquipo());

        equipo.agregarFutbolista(new Futbolista("Gero", 17,
                Posicion.PORTERO, 2500));

    }

}
