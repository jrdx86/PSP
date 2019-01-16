import java.util.concurrent.Semaphore;

public class SeccionCriticaSemaforos {
	private static Sumador sumadores[]; // Array de hilos
	private static Semaphore semaphore = new Semaphore(1);

	public static void main(String[] args) {
		int n_sum = 10;
		sumadores = new Sumador[n_sum];
		for (int i = 0; i < n_sum; i++) {
			sumadores[i] = new Sumador(10000000, i, semaphore);
			sumadores[i].start();
			try {
				sumadores[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Acumulador: " + Acumula.acumulador);
	}

}
