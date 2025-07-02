package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double cuota;
		double cO = prestamo.getMonto();
		double i = ((prestamo.getInteres()) / 12) / 100;
		int n = prestamo.getPlazo();
		cuota = cO * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
		return Utilitarios.redondear(cuota);
	}

	public static void generarTabla(Prestamo prestamo) {
		double valorCuota = calcularCuota(prestamo);
		int plazo = prestamo.getPlazo();
		ArrayList<Cuota> cuotas = new ArrayList<Cuota>();
		for (int i = 0; i < plazo; i++) {
			cuotas.add(new Cuota((i + 1)));
			cuotas.get(i).setCuota(valorCuota);
		}
		cuotas.get(0).setInicio(prestamo.getMonto());
		for(int i=0;i<plazo-1;i++) {
			calcularValoresCuota(prestamo.getInteres(),cuotas.get(i),cuotas.get(i+1));
		}
		calcularValoresCuota(prestamo.getInteres(), cuotas.get(plazo-1), null);
		prestamo.setCuotas(cuotas);
	}

	public static void calcularValoresCuota(double tasaAnual, Cuota actual, Cuota siguiente) {
		double tasaMensual = tasaAnual /12;
		double interes = actual.getInicio() * tasaMensual/100;
		interes = Utilitarios.redondear(interes);
		double capital = actual.getCuota() - interes;
		capital = Utilitarios.redondear(capital);
		double saldoFinal = actual.getInicio() - capital;
		saldoFinal = Utilitarios.redondear(saldoFinal);
		actual.setInteres(interes);
		actual.setAbonoCapital(capital);
		actual.setSaldo(saldoFinal);
		if (siguiente != null) {
			siguiente.setInicio(saldoFinal);
		} else {
			actual.setSaldo(0);
		}
	}
	public static void mostrarTabla(Prestamo prestamo) {
        System.out.println("numero | Cuota | Inicio | Interes | Abono | Saldo");
        for (int i=0;i<prestamo.getCuotas().size();i++) {
        	prestamo.getCuotas().get(i).mostrarPrestamo();
        }
	}
}
