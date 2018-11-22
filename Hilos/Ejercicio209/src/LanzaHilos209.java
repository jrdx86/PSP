
public class LanzaHilos209 {
	
	public static void main (String args[]) {
		//se crean los hilos
		hiloConParametros h1 = new hiloConParametros("Jordi",3);
		hiloConParametros h2 = new hiloConParametros("Carles",4);
		hiloConParametros h3 = new hiloConParametros("Pablo",10);
		
		h1.start();
		h2.start();
		h3.start();
		
		try {
			h1.join();
			h2.join();
			h3.join();
		}catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" interrumpido.");
			return;
		}
		System.out.println("Programa principal acabado");
	}

}
