
public class LanzaHilos214 {
	public static void main(String[] args) {
		//Crea los hilos con el parametro nombre
		HiloPrioridad h1 = new HiloPrioridad("Hilo1");
		HiloPrioridad h2 = new HiloPrioridad("Hilo2");
		HiloPrioridad h3 = new HiloPrioridad("Hilo3");
		//Muestra valor de las constantes
		System.out.println("Thread.MIN_PRIORITY"+Thread.MIN_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY"+Thread.NORM_PRIORITY);
		System.out.println("Thread.MAX_PRIORITY"+Thread.MAX_PRIORITY);
		
		h1.setPriority(Thread.MIN_PRIORITY);
		h2.setPriority(Thread.NORM_PRIORITY);
		h3.setPriority(Thread.MAX_PRIORITY);
		
		h1.start();
		h2.start();
		h3.start();
		//el programa principal espera 3 seg
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//Detenemos los hilos
		h1.pararHilo();
		h2.pararHilo();
		h3.pararHilo();
		//Impreme
		System.out.println(h1.getContador());
		System.out.println(h2.getContador());
		System.out.println(h3.getContador());





	}
}
