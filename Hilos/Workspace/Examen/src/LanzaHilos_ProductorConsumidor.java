
public class LanzaHilos_ProductorConsumidor {
	public static void main(String[] args) {
		Almacen almacen=new Almacen();
		Productor p1=new Productor("Productor ",almacen,1,3);
		Consumidor c1=new Consumidor("Consumidor ",almacen,1,3);
		
		
		p1.start();
		c1.start();
		
		try {
			p1.join();
			c1.join();
			
		}catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() +" interrumpido.");
				return;
		}
		
		
		System.out.println("***Fin de LanzaHilos***");

	}
}

class Almacen {
	private int numeroEnAlmacen;
	private boolean numeroAlmacenado = false;

	public synchronized int consume() {
		if (numeroAlmacenado) {
			numeroAlmacenado = false;
			return numeroEnAlmacen;
		}
		return -1;
	}

	public synchronized void produce(int valor) {
		numeroEnAlmacen = valor;
		numeroAlmacenado = true;
	}
}

class Productor extends Thread {
	private Almacen almacen;
	private int id;
	private int iteraciones;
	

	public Productor(String nombre,Almacen a, int n, int veces) {
		super(nombre);
		almacen = a;
		id = n;
		this.iteraciones = veces;
	}

	public void run() {
		for (int i = 0; i < this.iteraciones; i++) {
			almacen.produce(i);
			System.out.println(getName()+"produce el valor"+i);

			//try {
				//sleep(500);
			//} catch (InterruptedException e) {
			//}

		}
	}
}

class Consumidor extends Thread {
	private Almacen almacen;
	private int id;
	private int iteraciones;
	
	public Consumidor(String nombre, Almacen a, int n, int iteraciones) {
		super(nombre);
		almacen = a;
		this.id = n;
		this.iteraciones=iteraciones;
	}
	
	public void run() {
		int valor=0;
		for (int i = 0; i < this.iteraciones; i++) {
			valor=almacen.consume();
			System.out.println("Consumidor " + id + " en iteración "+ i+" consume el valor " + valor);

		}
	}

}

