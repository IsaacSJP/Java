package com.krakedev.estaticos.ejercicio.utilis;

public class Util {
	public static String formatearHora(int num) {
		String numS=num+"";
		if (numS.length()!=2) {
			numS="0"+num;
		}
		return numS;
	}
	public static String formatearDia(int numD) {
		String dia;
		if(numD==0) {
			dia="Lunes";
		}else if(numD==1) {
			dia="Martes";
		}else if(numD==2) {
			dia="Miercoles";
		}else if(numD==3) {
			dia="Jueves";
		}else if(numD==4) {
			dia="Viernes";
		}else if(numD==5) {
			dia="Sabado";
		}else if(numD==6) {
			dia="Domongo";
		}else {
			dia=null;
		}
		return dia;
	}
}
