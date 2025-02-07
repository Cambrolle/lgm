package test;

import modelos.Producto;
import modelos.Cliente;
import modelos.Almacen;
import modelos.TipoProducto;
import modelos.TipoCliente;

import java.time.LocalDate;

public class pruebaV1 {
    public static void main(String[] args) {
        Producto producto = new Producto(1, "001", "Leche", LocalDate.now().plusDays(10), TipoProducto.ALIMENTACION, new Almacen(1, "Almacen Central", 100), 1.50);
        Cliente cliente = new Cliente(1, "12345678A", "Juan", "Pérez", "Calle Falsa 123", TipoCliente.PARTICULAR);
        Almacen almacen = new Almacen(1, "Almacen Central", 100);

        System.out.println(producto);
        System.out.println(cliente);
        System.out.println(almacen);
    }
}

