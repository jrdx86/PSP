
public class Comienza {
	public static void main(String[] args) {
		// Objeto compartido
		Aula b = new Aula();
		int n_alumnos = 10;
		for (int i = 0; i < n_alumnos; i++) {
			Alumno alumno = new Alumno(b);
			alumno.setName("alumno-" + i);
			alumno.start();
		}
		Profesor profesor = new Profesor("Manolo Gomez", b);
		profesor.start();
	}
}