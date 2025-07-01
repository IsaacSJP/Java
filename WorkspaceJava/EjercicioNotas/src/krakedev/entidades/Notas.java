package krakedev.entidades;

public class Notas {
	private Materia materia;
	private double nota;

	public Notas(Materia materia, double nota) {
		this.materia = materia;
		this.nota = nota;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public void mostrar() {
		System.out.println("Materia: " + materia.getNombre() + " Nota: " + nota);
	}
}
