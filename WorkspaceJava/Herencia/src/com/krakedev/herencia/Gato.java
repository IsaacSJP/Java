package com.krakedev.herencia;

public class Gato extends Animal{
	public void dormir() {
		super.dormir();
		System.out.println("el animal en un gato!!!");
	}
	public void maullar() {
		System.out.println("el gato hace ruido");
	}
	public void maullar(Perro p) {
		System.out.println("gato maullando"+p);
	}
}
