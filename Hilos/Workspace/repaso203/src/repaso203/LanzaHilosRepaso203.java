package repaso203;

public class LanzaHilosRepaso203 {
	public static void main(String[] args) {
		HiloConParametros h1 = new HiloConParametros("Jorge", 10);
		HiloConParametros h2 = new HiloConParametros("Silvia", 10);
		HiloConParametros h3 = new HiloConParametros("Christian", 10);
		HiloConParametros h4 = new HiloConParametros("Mama", 10);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
	}

}
