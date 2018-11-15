
public class LanzaHilos06 {
	public static void main(String args[]) {
		//creo un objeto de la clase HiloEspera
		HiloEspera h1 = new HiloEspera();
		
		System.out.println("Soy lanza hilos y voy a lanzar HiloEspera");
		//ejecuto el hilo
		h1.start();
	}

}
