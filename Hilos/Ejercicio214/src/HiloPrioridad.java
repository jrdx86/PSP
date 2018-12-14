
public class HiloPrioridad extends Thread{
	//Cramos las variables internas al hilo
	private int c = 0;
	private boolean stopHilo = false;
	
	//constructor de la clase HiloPrioridad
	public HiloPrioridad(String nombre) {
		//heredamos nombre de la clase Thread
		super(nombre);
	}
	
	public int getContador() {
		return c;
	}
	
	public void pararHilo() {
		stopHilo = true;
	}
	public void run() {
		System.out.println("Inicio hilo"+this.getName());
		//Saca de Thread 
		System.out.println("Prioridad hilo"+ this.getName()+ ": "+this.getPriority());
		while (!stopHilo) {
			try {
				Thread.sleep(2);
			}catch (Exception e) {
			}
			c++;
		}
		//Indica que el hilo finaliza
		System.out.println("Fin hilo"+ this.getName());
	}
}
