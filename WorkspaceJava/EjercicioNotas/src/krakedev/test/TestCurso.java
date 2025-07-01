package krakedev.test;

import krakedev.entidades.Curso;
import krakedev.entidades.Estudiantes;
import krakedev.entidades.Materia;
import krakedev.entidades.Notas;

public class TestCurso {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Materia sociales = new Materia("COD1", "Sociales");
		Materia matematicas = new Materia("COD2", "Matematicas");
		Materia lenguaje = new Materia("COD3", "Lenguaje");

		Estudiantes estudiante = new Estudiantes("1234567890", "Juan", "Perez");
		Estudiantes estudiante2 = new Estudiantes("12345678290", "Juan", "Perez");
		Notas nota1 = new Notas(sociales, 10.0);
		Notas nota2 = new Notas(matematicas, 10.0);
		Notas nota3 = new Notas(lenguaje, 10.0);

		Notas nota11 = new Notas(sociales, 5.0);
		Notas nota12 = new Notas(matematicas, 5.0);
		Notas nota13 = new Notas(lenguaje, 10.0);

		// Agrega 3 nuevas calificaciones a Estudiante 1
		estudiante.agregarNota(nota1);
		estudiante.agregarNota(nota2);
		estudiante.agregarNota(nota3);

		// Agrega 3 nuevas calificaciones a Estudiante 2
		estudiante2.agregarNota(nota11);
		estudiante2.agregarNota(nota12);
		estudiante2.agregarNota(nota13);

		curso1.matricularEstudiante(estudiante);
		curso1.matricularEstudiante(estudiante2);

		System.out.println(curso1.getEstudiantes().size());

		System.out.println(curso1.calcularPromedioCurso());

		curso1.mostrar();
	}

}
