package repaso211;

public class HiloEspera extends Thread {
	int i;
	public HiloEspera(int i) {
		this.i = i;
	}

	public void run() {
		System.out.println("Soy el "+ Thread.currentThread().getName() +" empezando.");
		System.out.println("Voy a acabar");
		try {
			this.sleep(3000);
			// También se puede hacer así y lo aplicará al hilo actual.
			// Thead.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" interrumpido.");
			return;
		}
		
		System.out.println(Thread.currentThread().getName() +" acabado.");
		}

	
}
