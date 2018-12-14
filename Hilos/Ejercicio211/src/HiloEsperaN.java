
public class HiloEsperaN extends Thread
{
	
	public int n;
	
	public HiloEsperaN(int n) {
		this.n=n*1000;
	}
	
	public void run() {
		System.out.println("Soy el "+ Thread.currentThread().getName() +" empezando.");
		
		if(this.isDaemon()) {
			System.out.println("Demonio detectado");
		}
		
		try {
			this.sleep(n);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" interrumpido.");
			return;
		}
		System.out.println(Thread.currentThread().getName()+" he acabado");

}
}
