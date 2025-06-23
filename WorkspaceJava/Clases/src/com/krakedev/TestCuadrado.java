package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado(2.0);
		Cuadrado c2=new Cuadrado(4.0);
		Cuadrado c3=new Cuadrado(6.0);

		double areaC1;
		double areaC2;
		double areaC3;
		
		double perimetroC1;
		double perimetroC2;
		double perimetroC3;
		
		/*	los valores ya estan colocados
		c1.setLado(2);
		c2.setLado(4);
		c3.setLado(6);
		 */
		
		areaC1=c1.calcularArea();
		perimetroC1=c1.calcularPerimetro();
		areaC2=c2.calcularArea();
		perimetroC2=c2.calcularPerimetro();
		areaC3=c3.calcularArea();
		perimetroC3=c3.calcularPerimetro();
		
		System.out.println("area de c1: "+areaC1);
		System.out.println("perimetro c1: "+perimetroC1);
		System.out.println("area de c2: "+areaC2);
		System.out.println("perimetro c2: "+perimetroC2);
		System.out.println("area de c3: "+areaC3);
		System.out.println("perimetro c3: "+perimetroC3);
		
	}

}
