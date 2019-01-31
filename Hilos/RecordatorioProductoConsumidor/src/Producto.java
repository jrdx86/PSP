
public class Producto {
	
	int producir = 0;
	int consumir = 0;
	
	boolean contenedor = true;

	public synchronized void producir() {
		while(contenedor) {
				System.out.println("HiloProducir  ----> " + producir);
				producir++;
				notifyAll();
				try {
					//wait();
					wait(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
	
	public synchronized void consumir() {
		while(producir>0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (producir == 5) {
				break;
		}
		}
		System.out.println("HiloConsumir ----> " + consumir);
		consumir++;
		notifyAll();
	}
}
