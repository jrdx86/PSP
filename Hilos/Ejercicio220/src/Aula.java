
public class Aula {
	boolean clase_comenzada;

	public Aula() {
		this.clase_comenzada = false;
	}

	// Hasta que el profesor no salude no empieza la clase,
	// por lo que los alumnos esperan con un wait
	public synchronized void saludarProfesor() {
		try {
			while (clase_comenzada == false) {
				wait();
			}
			System.out.println(Thread.currentThread().getName() + " Buenos dias, profesor.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Cuando el profesor saluda avisa a los alumnos con notifyAll de su llegada
	public synchronized void llegadaProfesor(String nombre) {
		System.out.println("Buenos días a todos. Soy el profesor " + nombre);
		clase_comenzada = true;
		notifyAll();
	}
}

class Alumno extends Thread {
	Aula saludo;

	public Alumno(Aula bienvenida) {
		this.saludo = bienvenida;
	}

	public void run() {
		System.out.println("Alumno " + Thread.currentThread().getName() + " llega.");
		try {
			Thread.sleep(1000);
			saludo.saludarProfesor();
		} catch (InterruptedException e) {
			System.err.println("Thread alumno interrumpido!");
			System.exit(-1);
		}
	}
}

class Profesor extends Thread {
	String nombre;
	Aula saludo;

	public Profesor(String nombre, Aula bienvenida) {
		this.nombre = nombre;
		this.saludo = bienvenida;
	}

	public void run() {
		System.out.println(nombre + " llegÃ³.");
		try {
			Thread.sleep(3000);
			saludo.llegadaProfesor(nombre);
		} catch (InterruptedException e) {
			System.err.println("Thread profesor interrumpido!");
			System.exit(-1);
		}
	}
}
