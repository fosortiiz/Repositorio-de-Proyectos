package ClasesDatos;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * fosortiiz
 */
public class Futbolista implements Deportista, Comparable<Futbolista> {

    private String nombre;
    private int edad;
    Posicion posicion;
    private double salario;
    private int añosPro;
    List<String> equipos = new LinkedList<>();
    List<String> trofeos = new LinkedList<>();

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Futbolista(String nombre, int edad, Posicion posicion, double salario)
            throws RegistroFutbolistaException {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        setSalario(salario);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Posicion getPosicion() {
        return posicion;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void incAñosPro() {
        añosPro++;
    }

    public void setEquipos(String equipo) {
        equipos.add(equipo);
    }

    public void setTrofeos(String trofeo) {
        trofeos.add(trofeo);
    }

    public void setSalario(double salario) {
        if (salario < posicion.salarioMin || salario > posicion.salarioMax) {
            throw new RegistroFutbolistaException("El salario no está dentro"
                    + " de los límites");
        }

        this.salario = salario;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Métodos">
    @Override
    public String toString() {
        return nombre + " de " + edad + " años. Demarcación " + posicion
                + "\n" + listaEquipos() + "\n" + listaTrofeos();
    }

    @Override
    public int getAñosProfesional() {
        return añosPro;
    }

    @Override
    public List<String> getListadoEquipos() {
        return equipos;
    }

    @Override
    public int getTotalTrofeos() {
        return trofeos.size();
    }

    private String listaEquipos() {
        String salida = "\tEquipos: ";
        for (String s : equipos) {
            salida += s + ", ";
        }
        if (salida.length() > 20) {
            salida = salida.substring(0, salida.length() - 2);
        }

        return salida;
    }

    private String listaTrofeos() {
        String salida = "\tTrofeos: ";
        for (String s : trofeos) {
            salida += s + ", ";
        }
        if (salida.length() > 20) {
            salida = salida.substring(0, salida.length() - 2);
        }

        return salida;
    }
//</editor-fold>

    @Override
    public int compareTo(Futbolista o) {
        return posicion.ordenListado - o.posicion.ordenListado;
    }
}
