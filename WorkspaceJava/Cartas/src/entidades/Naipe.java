package entidades;

import java.util.ArrayList;

import servicios.Random;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	public Naipe() {
		numerosPosibles=new ArrayList<Numero>();
		cartas=new ArrayList<Carta>();
		Palos palos=new Palos();
		
		numerosPosibles.add(new Numero("A",11));
		for (int i=2;i<11;i++) {
			numerosPosibles.add(new Numero((i+""),i));	
		}
		numerosPosibles.add(new Numero("J",10));
		numerosPosibles.add(new Numero("Q",10));
		numerosPosibles.add(new Numero("K",10));
		for (int i=0;i<13;i++) {
			cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonRojo()));
		}
		for (int i=0;i<13;i++) {
			cartas.add(new Carta(numerosPosibles.get(i),palos.getCorazonNegro()));
		}
		for (int i=0;i<13;i++) {
			cartas.add(new Carta(numerosPosibles.get(i),palos.getDiamante()));
		}
		for (int i=0;i<13;i++) {
			cartas.add(new Carta(numerosPosibles.get(i),palos.getTrebol()));
		}
		
	}
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public ArrayList<Carta> barajar() {
		int posicion;
		Carta cartaA;
		ArrayList<Carta> auxiliar=new ArrayList<Carta>();
		for (int i=1;i<1001;i++) {
			posicion=Random.obtenerPosicion();
			cartaA=cartas.get(posicion);
			if (cartaA.getEstado().equals("N")) {
				auxiliar.add(cartaA);
				cartas.get(posicion).setEstado("C");
			}else {
			}
		}
		for (int i=0;i<cartas.size();i++) {
			if (cartas.get(i).getEstado().equals("N")) {
				auxiliar.add(cartas.get(i));
				cartas.get(i).setEstado("C");
			}else {
			}
		}
		return auxiliar;
	}
}
