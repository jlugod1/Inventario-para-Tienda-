package com.joselugo.clases;

import java.util.ArrayList;


public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    public TiendaElectronica() {
        // Inicializa la lista de productos
        this.listaDeProductos = new ArrayList<ProductoElectrodomestico>();
    }

    // Método para agregar productos
    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Método para mostrar productos disponibles
    public void mostrarProductos() {
        if (listaDeProductos.isEmpty()) {// ísEmpty nos indica si no haya nada en el arreglo
            System.out.println("No hay productos disponibles en el inventario.");
        } else {
            for (int i = 0; i < listaDeProductos.size(); i++) {
                listaDeProductos.get(i).despliegaInformacion();  // Mostrar la información del producto
            }
        }
    }

    
    public void realizarVenta(String nombreProducto) {
        boolean productoEncontrado = false;  // Bandera para saber si el producto fue encontrado
        
        for (int i = 0; i < listaDeProductos.size(); i++) {  // Uso del for con índice
            ProductoElectrodomestico producto = listaDeProductos.get(i);  // Obtener el producto en la posición actual
            
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoEncontrado = true;  // Producto encontrado
                
                if (producto.getCantidadDisponible() > 0) {
                    producto.reducirCantidad();  // Reducir la cantidad del producto
                    System.out.println("Venta realizada: " + producto.getNombre() + " (Cantidad restante: " + producto.getCantidadDisponible() + ")");
                } else {
                    System.out.println("Producto agotado: " + producto.getNombre());
                }
                break;  // Salir del ciclo si el producto fue encontrado
            }
        }
        
        if (!productoEncontrado) {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }
}