package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		int resultadoMultiplicacion;
		double resultadoDivicion;
		double resultadoPromedio;
		calcu=new Calculadora();
		resultadoSuma=calcu.sumar(5, 8);
		resultadoResta=calcu.restar(10, 11);
		resultadoMultiplicacion=calcu.munltiplicar(10,2);
		resultadoDivicion=calcu.dividir(10,2);
		resultadoPromedio=calcu.promediar(1, 2, 3);
		System.out.println("resultado suma: "+resultadoSuma);
		System.out.println("resultado resta: "+resultadoResta);
		System.out.println("resultado suma: "+resultadoMultiplicacion);
		System.out.println("resultado resta: "+resultadoDivicion);
		System.out.println("resultado suma: "+resultadoPromedio);
		calcu.mostrarResultado();
	}

}
