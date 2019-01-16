
public class HiloTac extends Thread {
	private Reloj reloj;
	private int n;

	public HiloTac(String nombre, Reloj r, int n) {
		super(nombre);
		reloj = r;
		this.n = n;
	}

	public void run() {
		int it = 0;
		while (it < n) {
			System.out.println(getName() + "llama a tac " + it);
			reloj.tac();
			it++;
			try {
				sleep(2000);
			} catch (InterruptedException e) {
			}
		}

	}// Fin de run

}// Fin de HiloTac


