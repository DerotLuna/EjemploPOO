package com.rubenluna.conductor;

import com.rubenluna.vehiculo.Bus;

public class ConductorBus extends Conductor{

	private Bus bus;
	
	public ConductorBus(String nombre, String licencia) {
		super(nombre, licencia);
		// TODO Auto-generated constructor stub
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

}
