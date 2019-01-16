package repaso211;

public class LanzaHilosRepaso211 {
	public static void main(String args[]) {
		//creo un objeto de la clase HiloEspera
		HiloEspera h1 = new HiloEspera(1);
		HiloEspera h2 = new HiloEspera(20);
		
		h2.setName("Demonioorrr");
		h2.setDaemon(true);
		System.out.println("Soy lanza hilos y voy a lanzar HiloEspera");
		System.out.println(h2.isDaemon());
		//ejecuto el hilo
		h1.start();
		h2.start();
	}

}
