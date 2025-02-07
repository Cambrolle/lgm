package modelos;

public class Almacen {
    private int identificador;
    private String nombre;
    private int capacidad;

    // Constructores
    public Almacen() {}
    public Almacen(Almacen otro) {
        this.identificador = otro.identificador;
        this.nombre = otro.nombre;
        this.capacidad = otro.capacidad;
    }
    public Almacen(int identificador, String nombre, int capacidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    // ...

    // Métodos toString, equals y hashCode
    // ...
}
