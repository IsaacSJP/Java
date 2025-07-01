package krakedev.test;

import krakedev.entidades.Estudiantes;
import krakedev.entidades.Materia;
import krakedev.entidades.Notas;

public class TestEstudiantes {

	public static void main(String[] args) {
		Estudiantes estudiante = new Estudiantes("1234567890", "Juan2", "Perez");
		 Estudiantes estudiante2 = new Estudiantes("1234567890", "Juan", "Perez");
		 Materia ciencias= new Materia("3", "Ciencias");
		 Materia matematicas= new Materia("2", "Matematicas");
		 
		 Notas nuevaNota = new Notas(ciencias,9.0);
		 Notas nuevaNota2 = new Notas(ciencias, 9.0);
		 Notas nuevaNota3 = new Notas(matematicas,2.0);
		 Notas nuevaNota4 = new Notas(matematicas,-8.0);
	   
	     estudiante.agregarNota(nuevaNota);
	     //No deberia dejar ingresar esta nota ya que la calificacion esta duplicada.
	     estudiante.agregarNota(nuevaNota2);
	     //No deberia dejar ingresar esta nota ya que la calificacion es menor a 0.
	     estudiante.agregarNota(nuevaNota3);
	     estudiante.agregarNota(nuevaNota4);
	     
	     estudiante.modificarNota("3", 10.00);
	     //No deberia dejar modificar esta nota ya que la calificacion es menor a 0.
	     estudiante.modificarNota("3", -1);
	     System.out.println( estudiante.calcularPromedioNotasEstudiante());
	     
	     
	     estudiante.mostrar();
	}

}
