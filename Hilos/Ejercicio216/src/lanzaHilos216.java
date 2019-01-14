import java.util.concurrent.Semaphore;

public class lanzaHilos216 {
	public static void main(String[] args) {
		Contador contador = new Contador(100);
		Semaphore sem = new Semaphore(1);
		HiloSumador hiloSumador = new HiloSumador("Hilo sumador", contador, 300,sem);
		HiloRestador hiloRestador = new HiloRestador("Hilo Restador", contador, 300,sem);
		
		hiloSumador.start();
		hiloRestador.start();
		
		try {
			hiloSumador.join();
			hiloRestador.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Valor del contador: " + contador.mostrarValor());
		System.out.println("Programa finalizado");
}
}
