package com.krakedev.herencia;

public class TestPersona {

	public static void main(String[] args) {
		Persona p=new Persona("1728866524","Isaac");
		//System.out.println("hola");
		System.out.println(p);//p.toString
		Cuenta c=new Cuenta("1221221",100.56);
		System.out.println(c);
	}

}
