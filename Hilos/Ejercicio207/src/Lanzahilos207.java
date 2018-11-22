
public class Lanzahilos207 {
	public static void main(String[] args) {
		HiloEsperaNseg hilo1 = new HiloEsperaNseg(3);
		HiloEsperaNseg hilo2 = new HiloEsperaNseg(5);
		
		hilo1.setName("Hilo1");
		hilo2.setName("Hilo2");
		
		hilo1.start();
		hilo2.start();
		
		try {
			Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" interrumpido.");
			return;
		}
		System.out.println("Soy el hilo principal y he terminado");
		
	}

}
