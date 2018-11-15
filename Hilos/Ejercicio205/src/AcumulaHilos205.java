

public class AcumulaHilos205 extends Thread{
	public int veces=0;
	
	public AcumulaHilos205(int veces) {
		this.veces=veces;
	}
	public void run() {
		System.out.println("Hilo inicializado: " +(veces));
		System.out.println("Hilo finalizado: " +(veces));
		}
	}
