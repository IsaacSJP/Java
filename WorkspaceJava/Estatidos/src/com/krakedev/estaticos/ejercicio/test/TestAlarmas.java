package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estatidos.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma a1=new Alarma(DiasSemana.LUNES,10,30);
		Alarma a2=new Alarma(DiasSemana.DOMINGO,10,30);
		Alarma a3=new Alarma(DiasSemana.MARTES,10,30);
		Alarma a4=new Alarma(DiasSemana.VIERNES,10,30);
		Alarma a5=new Alarma(DiasSemana.LUNES,10,30);
		AdminAlarmas adA=new AdminAlarmas();
		adA.agregarAlarma(a1);
		adA.agregarAlarma(a2);
		adA.agregarAlarma(a3);
		adA.agregarAlarma(a4);
		adA.agregarAlarma(a5);
		ArrayList<Alarma> list=adA.getAlarmas();
		System.out.println(list);
	}

}
