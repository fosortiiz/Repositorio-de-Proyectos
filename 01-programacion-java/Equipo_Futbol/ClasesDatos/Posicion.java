package ClasesDatos;

/**
 *
 * @author fosortiiz
 */
public enum Posicion {
    PORTERO("Portero", 2000, 3000, 1),
    DEFENSA("Defensa", 2500, 3500, 2),
    MEDIO("Medio", 3500, 4000, 3),
    DELANTERO("Delantero", 4000, 5000, 4);

    String nombre;
    int salarioMin;
    int salarioMax;
    int ordenListado;

    private Posicion(String nombre, int salarioMin, int salarioMax, int ordenListado) {
        this.nombre = nombre;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.ordenListado = ordenListado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalarioMin() {
        return salarioMin;
    }

    public int getSalarioMax() {
        return salarioMax;
    }

    public int getOrdenListado() {
        return ordenListado;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
