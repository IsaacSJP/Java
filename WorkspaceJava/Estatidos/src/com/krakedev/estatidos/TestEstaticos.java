package com.krakedev.estatidos;

public class TestEstaticos {

	public static void main(String[] args) {
		// un metodo estatico se puede usar desde la clase (no es nesesario crear un objeto)
		double numero=Math.random();
		System.out.println(numero);
		double radio=10;
		double area=Math.PI*radio;
		System.out.println(area);
	}

}
