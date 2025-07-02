package com.cmc.evaluacion.servicios;

public class Utilitarios {
	public static double redondear(double num) {
		double numN= Math.round(num * 100.0) / 100.0;
		return numN;
	}
}
