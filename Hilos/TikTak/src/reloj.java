import java.nio.charset.MalformedInputException;

public class reloj {
	boolean tik = false;
	
	
	public synchronized void tik() {
		while(tik==false) {
			try {
				wait();
			}catch(InterruptedException e) {
				
			}
			System.out.println("TIK");
			
			tik = false;
			notifyAll();
		}
	}
	
	public synchronized void tak() {
		while(tik==true) {
			try {
				wait();
			}catch(InterruptedException e) {
				
				
			}
			System.out.println("TAK");
			tik= true;
			notifyAll();
							
			
		}
		
	}

}
