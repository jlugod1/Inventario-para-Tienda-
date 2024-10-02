package com.joselugo.clases;


	public class Televisor extends ProductoElectrodomestico {
		private int tamañoPantalla;
		private String resolucion;
		public Televisor(String nombre, double precio, int cantidadDisponible, int tamañoPantalla, String resolucion) {
			super(nombre, precio, cantidadDisponible);
			this.tamañoPantalla = tamañoPantalla;
			this.resolucion = resolucion;
		}
		@Override
		public void despliegaInformacion() {
			// TODO Auto-generated method stub
			super.despliegaInformacion();
			System.out.println("Tamaño de pantalla: " + tamañoPantalla + " pulgadas");
		    System.out.println("Resolución: " + resolucion);
		}
		public int getTamañoPantalla() {
			return tamañoPantalla;
		}
		public void setTamañoPantalla(int tamañoPantalla) {
			this.tamañoPantalla = tamañoPantalla;
		}
		public String getResolucion() {
			return resolucion;
		}
		public void setResolucion(String resolucion) {
			this.resolucion = resolucion;
		}

		}



