package com.rubenluna.conductor;

public class Conductor {
	private String nombre;
	private String licencia;
	
	public Conductor(String nombre, String licencia) {
		super(); // llama al constructor de la clase padre
		this.nombre = nombre;
		this.licencia = licencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	
	public void mostrarVehiculo(){
		System.out.println("Datos del vehiculo");
	}
}
