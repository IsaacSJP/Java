package entidades;

import java.util.ArrayList;

public class Jugadores {
	private ArrayList<String> jugadores;
	
	public void jugar(ArrayList<String> jugadores) {
		Juego juego=new Juego(jugadores);
		ArrayList<Carta> baraja=juego.getNaipe().barajar();
		juego.setNaipeBarajado(baraja);
	}
	
	
	
	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
}
