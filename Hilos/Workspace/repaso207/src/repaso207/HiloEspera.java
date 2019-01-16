package repaso207;

public class HiloEspera extends Thread {
	public int n;
	public HiloEspera(int n) {
		this.n = n*1000;
	}
	
	public void run(){
		
		// se puede quitar Thread.currentThread() porque desciende de la propia clase Thread
				System.out.println("Soy el " + Thread.currentThread().getName() + " empezando.");
				System.out.println("Soy el " + getName() + " y voy a parar "+ n +" ms");
				try {
					Thread.sleep(n);//
				} catch (InterruptedException e) {
					System.out.println(Thread.currentThread().getName() + " interrumpido.");
				}
				System.out.println(Thread.currentThread().getName() + " acabado.");
			}
		}
