
public class HiloTic extends Thread {
	private Reloj reloj;
	private int n;

	public HiloTic(String nombre, Reloj r, int n) {
		super(nombre);
		reloj = r;
		this.n = n;

	}

	public void run() {
		int it = 0;
		while (it < n) {
			System.out.println(getName() + "llama a tic " + it);
			reloj.tic();
			it++;
			try {
				sleep(2000);
			} catch (InterruptedException e) {
			}
		}

	}// Fin de run

}// Fin de HiloTic