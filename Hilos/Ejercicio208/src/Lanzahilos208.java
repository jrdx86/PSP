
public class Lanzahilos208 {
	public static void main(String[] args) {
		HiloEsperaPadre hilo1 = new HiloEsperaPadre(3);
		HiloEsperaPadre hilo2 = new HiloEsperaPadre(5);
		
		hilo1.setName("Hilo1");
		hilo2.setName("Hilo2");
		
		hilo1.start();
		hilo2.start();
		
		try {
			hilo1.join();
			hilo2.join();
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" interrumpido.");
			return;
		}
		System.out.println("Soy el hilo principal y he terminado");
		
	}

}