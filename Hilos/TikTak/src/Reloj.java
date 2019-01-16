import java.nio.charset.MalformedInputException;

public class Reloj {
	private boolean tac = false; // inicialmente se imprimirá TIC

	public synchronized void tic() {

		while (tac) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		} // fin de while
		System.out.println("TIC");
		tac = true;
		notifyAll();

	}// Fin de tic

	public synchronized void tac() {

		while (!tac) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("TAC");
		tac = false; //
		notifyAll();

	}// Fin de tac

}// Fin de TicTac
