package repaso207;

public class LanzaHilosRepaso207 {
	
	public static void main(String[] args) {
		
	
	HiloEspera h1 = new HiloEspera(3);
	HiloEspera h2 = new HiloEspera(5);
	
	h1.start();
	h2.start();
	
	try {
		//h1.join();
		//h2.join();
		Thread.currentThread().sleep(4000);
	}catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" interrumpido.");
			return;
	}
	System.out.println("Soy el hilo principal y he acabado");

	}
}
