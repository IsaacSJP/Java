package com.krakedev.estatidos;

public class Calculos {
	private final double IVA=12;
	//final crea costantes valor que no puede cambiar
	public double calcularIva(double monto) {
		return monto*IVA/100;
	}
}
