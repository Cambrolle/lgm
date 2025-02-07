package modelos;

public class Contrato {
    private int identificador;
    private double salarioBase;
    private TipoContrato tipoContrato;

    // Constructores
    public Contrato() {}
    public Contrato(Contrato otro) {
        this.identificador = otro.identificador;
        this.salarioBase = otro.salarioBase;
        this.tipoContrato = otro.tipoContrato;
    }
    public Contrato(int identificador, double salarioBase, TipoContrato tipoContrato) {
        this.identificador = identificador;
        this.salarioBase = salarioBase;
        this.tipoContrato = tipoContrato;
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    // Métodos toString, equals y hashCode
    // ...
}


