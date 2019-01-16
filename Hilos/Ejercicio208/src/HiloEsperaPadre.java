
public class HiloEsperaPadre extends Thread{

	public int n;
	
	public HiloEsperaPadre(int n) {
		this.n=n*1000;
	}
	
	public void run() {
		System.out.println("Soy el "+ Thread.currentThread().getName() +" empezando.");
		
		try {
			//HiloEsperaPadre.sleep(n);
			this.sleep(n);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" interrumpido.");
			return;
		}
		System.out.println(Thread.currentThread().getName()+" he acabado");

}

}
