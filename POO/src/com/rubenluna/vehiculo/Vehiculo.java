package com.rubenluna.vehiculo;

public class Vehiculo {
	// primero los atributos 
	// es una buena practica encapsular los atributos
	private String matricula; 
	private String marca;
	private String modelo;
	private short anho;
	
	public Vehiculo(String matricula, String marca, String modelo, int anho) { //constructor para los datos obligatorios
		super();
		// this.matricula = matricula; o llamamos a la funcion que se hizo
		setMatricula(matricula);
		this.marca = marca;
		this.anho = (short) anho;
		this.modelo = modelo;
	}

	public String getMatricula(){
		return matricula;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public short getAnho() {
		return anho;
	}

	public void setAnho(short anho) {
		this.anho = anho;
	}

	//comportamiento o funcionalidades (metodos)
	//Lower camel case
	public void arrancar (){
		System.out.println("El vehiculo arrannco");
	}
	
	public void frenar (){
		System.out.println("El vehiculo freno");
	}
	
	public void cambio (){
		System.out.println("El vehiculo cambio de velocidad");
	}
}
