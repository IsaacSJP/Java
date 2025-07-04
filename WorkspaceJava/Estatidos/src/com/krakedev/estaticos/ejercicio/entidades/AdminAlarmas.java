package com.krakedev.estaticos.ejercicio.entidades;

import java.util.ArrayList;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas;
	
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	public AdminAlarmas() {
		alarmas=new ArrayList<Alarma>();
	}
	public void agregarAlarma(Alarma alarmaN) {
		alarmas.add(alarmaN);
	}
}
