package com.krakedev.herencia;

public class TestSobrecarga {

	public static void main(String[] args) {
		Perro p=new Perro();
		Gato g=new Gato();
		g.maullar();
		g.maullar(p);
	}

}
