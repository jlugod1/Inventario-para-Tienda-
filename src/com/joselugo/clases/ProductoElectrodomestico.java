package com.joselugo.clases;

public class ProductoElectrodomestico {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public ProductoElectrodomestico(String nombre, double precio) {
        this(nombre, precio, 0); // contructor sobrecargado. Inicializa cantidadDisponible en 0
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void despliegaInformacion() {
        System.out.println("producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + cantidadDisponible);
    }

    public void reducirCantidad() {
        if (cantidadDisponible > 0) {
            cantidadDisponible--;
        }
    }
}