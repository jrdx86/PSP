package repaso201;

public class Lanzahilos201 {
	public static void main(String[] args) {
		hola hilo = new hola();
		hilo.start();
		System.out.println("Hola desde el hilo principal");
		System.out.println("Proceso acabado");
	}

}
