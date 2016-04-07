package com.rubenluna.conductor;

import com.rubenluna.vehiculo.Taxi;

public class ConductorTaxi extends Conductor{
	
	private Taxi taxi;
	
	public ConductorTaxi(String nombre, String licencia, Taxi taxi) {
		super(nombre, licencia); // super referencia a todos los elemenntos que esten en la class padre
		this.taxi = taxi; // this referencia a todos los elemenntos que esten en la class en la que me encuentre
		// TODO Auto-generated constructor stub
	}

	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	@Override
	public void mostrarVehiculo() {
		// TODO Auto-generated method stub
		super.mostrarVehiculo();
		System.out.println(getTaxi().getMatricula());
		System.out.println(getTaxi().getMarca());
		System.out.println(getTaxi().getModelo());
		System.out.println(getTaxi().getAnho());
	}
	
	
}
