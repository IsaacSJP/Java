package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private Cuota cuota;
	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}


	public void setCuotas(ArrayList<Cuota> cuotas) {
		this.cuotas = cuotas;
	}

	private ArrayList<Cuota> cuotas;

	public Prestamo(double monto, double interes, int plazo) {
		this.cuota=new Cuota(plazo);
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
	}
	

	public Cuota getCuota() {
		return cuota;
	}
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public void mostrarPrestamo() {
		System.out.println("Monto= "+monto+", interes= "+interes+", plazo= "+plazo);
	}
}
