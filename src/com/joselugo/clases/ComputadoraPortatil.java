package com.joselugo.clases;


	public class ComputadoraPortatil extends ProductoElectrodomestico {
		private String marca;
		private int memoriaRAM ;
		private int  numeroSerie;
		public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoriaRAM,
				int numeroSerie) {
			super(nombre, precio, cantidadDisponible);
			this.marca = marca;
			this.memoriaRAM = memoriaRAM;
			this.numeroSerie = numeroSerie;
		}
		@Override
		public void despliegaInformacion() {
			// TODO Auto-generated method stub
			super.despliegaInformacion();
			System.out.println("marca:" + this.marca );
			System.out.println("memoria RAM:" + this.memoriaRAM);
			System.out.println("numero de serie:" + this.numeroSerie );
		}
		

}
