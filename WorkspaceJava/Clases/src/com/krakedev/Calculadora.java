package com.krakedev;

public class Calculadora {
	//no hay atributos sulo metodos
	public int sumar(int valor1,int valor2) {
		int resultado;
		resultado=valor1+valor2;
		return resultado;
	}
	public int restar(int valor1,int valor2) {
		int resultado;
		resultado=valor1-valor2;
		return resultado;
	}
	public int munltiplicar(int valor1,int valor2) {
		int resultado;
		resultado=valor1*valor2;
		return resultado;
	}
	public double dividir(int valor1,int valor2) {
		double resultado;
		resultado=valor1/valor2;
		return resultado;
	}
	public double promediar(double valor1,double valor2,double valor3) {
		double resultado;
		resultado=(valor1+valor2+valor3)/3;
		return resultado;
	}
	public void mostrarResultado(){
		System.out.println("Ahora no juven, Sali al almuerzo. Regreso en 15 minutos");
	}
}
