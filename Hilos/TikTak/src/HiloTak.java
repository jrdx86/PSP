
public class HiloTak extends Thread {
	String nombre;
	reloj r;
	int n;
		
	public HiloTak(String nombre, reloj r, int n) {
		this.nombre = nombre;
		this.r=r;
		this.n=n;
		
	}
	
	public void run() {
		for(int i=0;i<this.n;i++) {
			r.tak();
		}
	}
	}


