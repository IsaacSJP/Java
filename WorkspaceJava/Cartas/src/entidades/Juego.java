package entidades;

import java.util.ArrayList;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	private ArrayList<Carta> naipeBarajado;
	
	
	public Juego(ArrayList<String> ids) {
		this.cartasJugador=new ArrayList<ArrayList<Carta>>();
		naipe=new Naipe();
		naipeBarajado=naipe.barajar();
		for (int i=0;i<ids.size();i++) {
			cartasJugador.add(new ArrayList<Carta>());
		}
	}
	
	public ArrayList<Carta> getNaipeBarajado() {
		return naipeBarajado;
	}

	public void setNaipeBarajado(ArrayList<Carta> naipeBarajado) {
		this.naipeBarajado = naipeBarajado;
	}

	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}
	public void setCartasJugador(ArrayList<ArrayList<Carta>> cartasJugador) {
		this.cartasJugador = cartasJugador;
	}
	
	public void entregarCartas(int cantidad) {
		int cartaA=0;
		for (int i=0;i<cantidad;i++) {
			for (int j=0;j<cartasJugador.size();j++) {
				cartasJugador.get(j).add(naipeBarajado.get(cartaA));
				cartaA++;
			}
		}
	}
	public int devolverTotal(int jugador) {
		int valor=0;
		for (int i=0;i<cartasJugador.get(jugador).size();i++) {
			valor+=cartasJugador.get(jugador).get(i).getNumero().getValor();
		}
		return valor;
	}
	public String determinarGanador() {
		String ganador=null;
		int auxiliar=0;
		for (int i=0;i<cartasJugador.size();i++) {
			if(devolverTotal(i)>auxiliar) {
				auxiliar=devolverTotal(i);
				ganador="jugador "+(i+1);
			}
		}
		return ganador;
	}
}
