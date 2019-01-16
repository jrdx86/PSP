package repaso205;

public class FabricaHilos extends Thread {
	int hilos;
	
	public FabricaHilos(int hilos) {
		this.hilos = hilos;
		
	}
	
	public void run() {
		System.out.println("Hilo inicializado: " +(hilos));
		System.out.println("Hilo finalizado: " +(hilos));
	}

}
