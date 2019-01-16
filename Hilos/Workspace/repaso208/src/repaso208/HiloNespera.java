package repaso208;

public class HiloNespera extends Thread {
	int n;
	
	public HiloNespera(int n) {
		this.n= n*1000;
	}
	
	public void run() {
		System.out.println("Soy el"+ currentThread().getName() +"empezando");
		
		try {
			this.sleep(n);
		}catch (InterruptedException e){
			System.out.println(Thread.currentThread().getName() +" interrumpido.");
			return;
			
		}
		System.out.println("Soy el" +currentThread().getName()+"he terminado");
	}

}
