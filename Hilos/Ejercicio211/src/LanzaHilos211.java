
public class LanzaHilos211 {
public static void main(String[] args) {
		
		HiloEsperaN hilo1 = new HiloEsperaN(3);
		HiloEsperaN hilo2 = new HiloEsperaN(5);
		HiloEsperaN hilo3 = new HiloEsperaN(6);
		
		//convierto hilo3 en daemon
		hilo3.setDaemon(true);
		
		hilo1.setName("Hilo1");
		hilo2.setName("Hilo2");
		hilo3.setName("Demonio");
	
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		try {
			Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" interrumpido.");
			return;
		}
		System.out.println("Soy el hilo principal y he terminado");
		
	}
}
