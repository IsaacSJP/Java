package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 =new Rectangulo(10,5);
		Rectangulo r2 =new Rectangulo(8,3);
		
		int areaR1;
		int areaR2;
		
		double perimetro1;
		double perimetro2;
		
		/*los valores ya estan establesidos
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(3);
		*/
		areaR1=r1.calcularArea();
		areaR2=r2.calcularArea();
		perimetro1=r1.calcularPerimetro();
		perimetro2=r2.calcularPerimetro();
		System.out.println("area de r1 es: "+areaR1);
		System.out.println("area de r2 es: "+areaR2);
		System.out.println("perimetro de r1 es: "+perimetro1);
		System.out.println("perimetro de r2 es: "+perimetro2);
	}
}
