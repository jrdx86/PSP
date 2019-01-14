
public class HiloTik extends Thread {
	String nombre;
	reloj r;
	int n;
		
	public HiloTik(String nombre, reloj r, int n) {
		super(nombre);
		this.r=r;
		this.n=n;
		}
	
	public void run() {
		for(int i=0;i<this.n;i++) {
			r.tik();
		}
	}

}
