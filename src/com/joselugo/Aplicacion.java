package com.joselugo;

import com.joselugo.clases.ComputadoraPortatil;
import com.joselugo.clases.Televisor;
import com.joselugo.clases.TiendaElectronica;
import com.joselugo.clases.ProductoElectrodomestico;
public class Aplicacion {
    public static void main(String[] args) {
        // Crear una instancia de TiendaElectronica
        
    	
    	
    	TiendaElectronica tienda = new TiendaElectronica();
       
    	//instanciando productos electromesticos 
    	ProductoElectrodomestico tostiarepa1 = new ProductoElectrodomestico ("tostiarepa", 100.00, 3);
        
        ProductoElectrodomestico electrodomestico = new ProductoElectrodomestico("Batidora", 50.00, 15);

        // Agregar el electrodoméstico a la tienda
        tienda.agregarProducto(electrodomestico);
        tienda.agregarProducto(tostiarepa1);
        
        // Instanciar productos electrónicos
        Televisor televisor1 = new Televisor("televisor Sony Bravia", 600.00, 1, 55, "4K");
        Televisor televisor2 = new Televisor("televisor Samsung QLED", 1200.00, 10, 65, "4K");
        ComputadoraPortatil computadora1 = new ComputadoraPortatil("lapto Asus ZenBook", 950.00, 5, "Asus", 16, 987654);
        ComputadoraPortatil computadora2 = new ComputadoraPortatil("lapto Lenovo ThinkPad", 1100.00, 3, "Lenovo", 32, 123456);

        // Agregar productos al inventario de la tienda
        tienda.agregarProducto(televisor1);
        tienda.agregarProducto(televisor2);
        tienda.agregarProducto(computadora1);
        tienda.agregarProducto(computadora2);

        // Mostrar todos los productos disponibles en el inventario
        System.out.println("Productos disponibles en la tienda:");
        tienda.mostrarProductos();

        // Realizar algunas ventas
        System.out.println("Realizando ventas:");
        tienda.realizarVenta("batidora");//venta exitosa
        tienda.realizarVenta("tostiarepa");// venta exitosa
        tienda.realizarVenta("Samsung QLED"); // Venta exitosa
        tienda.realizarVenta("lapto Asus ZenBook");  // Venta exitosa
        tienda.realizarVenta("lapto Lenovo ThinkPad"); // Venta exitosa
        tienda.realizarVenta("televisor Sony Bravia");   // Venta exitosa
        tienda.realizarVenta("televisor Sony Bravia");   // Producto agotado
        tienda.realizarVenta("piano"); // Producto no encontrado

        // Mostrar productos después de las ventas
        System.out.println("\nProductos disponibles después de las ventas:");
        tienda.mostrarProductos();
    }
}