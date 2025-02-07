package modelos;

public class LineaFactura {
    private int identificador;
    private Factura factura;
    private Producto producto;
    private int cantidad;

    // Constructores
    public LineaFactura() {}
    public LineaFactura(LineaFactura otra) {
        this.identificador = otra.identificador;
        this.factura = otra.factura;
        this.producto = otra.producto;
        this.cantidad = otra.cantidad;
    }
    public LineaFactura(int identificador, Factura factura, Producto producto, int cantidad) {
        this.identificador = identificador;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Métodos toString, equals y hashCode
    // ...
}