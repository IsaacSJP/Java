package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf) {
		if (telf==null) {
			System.out.println("el telefono es 'null'");
		}else if(telf.getOperadora()=="movi") {
			telf.setTieneWhatsapp(true);
		}else {
			telf.setTieneWhatsapp(false);
		}
	}
	public int contarMovi(Telefono telf1,Telefono telf2,Telefono telf3) {
		int contador=0;
		if(telf1.getOperadora()=="movi") {
			contador+=1;
		}else {}
		if(telf2.getOperadora()=="movi") {
			contador+=1;
		}else {}
		if(telf3.getOperadora()=="movi") {
			contador+=1;
		}else {}
		return contador;
	}
	public int contarClaro(Telefono telf1,Telefono telf2,Telefono telf3,Telefono telf4) {
		int contador=0;
		if(telf1.getOperadora()=="claro") {
			contador+=1;
		}else {}
		if(telf2.getOperadora()=="claro") {
			contador+=1;
		}else {}
		if(telf3.getOperadora()=="claro") {
			contador+=1;
		}else {}
		if(telf4.getOperadora()=="claro") {
			contador+=1;
		}else {}
		return contador;
	}
	
}
