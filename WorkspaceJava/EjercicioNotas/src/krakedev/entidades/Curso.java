package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiantes> estudiantes;

	public Curso() {
		this.estudiantes = new ArrayList<Estudiantes>();
	}

	public ArrayList<Estudiantes> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String buscarEstudiantePorCedula(Estudiantes estudiante) {
		String mensaje = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			if (estudiantes.get(i).getCedula().contentEquals(estudiante.getCedula())) {
				mensaje = "el estudiante ya esta en este curso";
			}
		}
		return mensaje;
	}

	public void matricularEstudiante(Estudiantes estudiante) {
		String estudianteBusqueda = buscarEstudiantePorCedula(estudiante);
		if (estudianteBusqueda == null) {
			estudiantes.add(estudiante);
		} else {
			System.out.println(estudianteBusqueda);
		}
	}

	public double calcularPromedioCurso() {
		double promedioE;
		double promedioC = 0;
		for (int i = 0; i < estudiantes.size(); i++) {
			promedioE = estudiantes.get(i).calcularPromedioNotasEstudiante();
			promedioC += promedioE;
		}
		promedioC = promedioC / estudiantes.size();
		return promedioC;
	}

	public void mostrar() {
		for (int i = 0; i < estudiantes.size(); i++) {
			estudiantes.get(i).mostrar();
		}
	}

}
