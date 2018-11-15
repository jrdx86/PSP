
public class CreaHilos {
	public static void main(String args[]) {
		LanzaHilos07 hilo1 = new LanzaHilos07();
		LanzaHilos07 hilo2 = new LanzaHilos07();
		
		hilo1.setName("hilo 1");
		hilo2.setName("hilo 2");
		hilo1.start();
		hilo2.start();
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" interrumpido. ");
				return;
		}
		hilo1.interrupt();
	}
}