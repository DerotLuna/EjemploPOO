package com.rubenluna.vehiculo;

import java.util.ArrayList;

import com.rubenluna.conductor.Conductor;
import com.rubenluna.conductor.ConductorTaxi;

public class POO {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Vehiculo miVehiculo = new Vehiculo();  Vehiculo() es un metodo especial, es un metodo constructor crea nuevas instancias de una clase. Se llama igual que la clase
		// cuando un objeto se crea, se le da vida al objeto se llama instancia.
		/* miVehiculo.marca = "Ford";
		miVehiculo.modelo = "Mustang";
		miVehiculo.anho = 1968; */ //cuando no se es private
		Vehiculo miVehiculo = new Vehiculo("DF7FH37", "Ford", "Mustang", 1968); // para darle datos obligatorios a los atributos deseados.
		// miVehiculo.setMatricula("AF43fHB2");
		// System.out.println(miVehiculo.getMatricula()); //imrpime matricula
		
	/*	ArrayList<String> lista = new ArrayList<String>(); // Listas.  <tipo de dato objeto> 
		lista.add("Hola "); 
		lista.add("como ");
		lista.add("estas");
		
		for (String s : lista) {
			System.out.println(s);
		} */
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(miVehiculo);
		vehiculos.add(new Vehiculo("U3YH4B", "Chevrolet", "Camaro", 2015));
		
		/*
		 * Puesto que el objeto Vehiculo tienes sus atributos en private, no se puede acceder a ellos
		 * de una forma comun. Hay que hacer los metodos get y set. Y asi poder manipularlos
		*/
		
		miVehiculo.cambio();
		miVehiculo.arrancar();
		miVehiculo.cambio();
		miVehiculo.frenar();
		
		Conductor elConductor = new Conductor("Pedro", "Automoviles");
	}

}
