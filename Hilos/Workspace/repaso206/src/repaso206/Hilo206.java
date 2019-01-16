package repaso206;

public class Hilo206 extends Thread{
	
	public void run() {
		System.out.println("Esta empezando");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			return;
		}
		System.out.println("Voy a acabar");
	}

}
