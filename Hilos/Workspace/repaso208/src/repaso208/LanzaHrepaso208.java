package repaso208;

public class LanzaHrepaso208 {

	public static void main(String[] args) {
		HiloNespera h1 = new HiloNespera(3);
		HiloNespera h2 = new HiloNespera(5);
		
		h1.start();
		h2.start();
		
		try {
			h1.join();
			h2.join();
		}
			catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() +" interrumpido.");
				return;
			}
			System.out.println("Soy el hilo padre y he terminado");
	}

}
