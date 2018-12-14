
public class HilosRecursivo extends Thread {
	public static int veces;
	
	public HilosRecursivo(int veces) {
		//numero de iteraciones recursivas o hilos que faltan por crear
		this.veces=veces;
	}
	public void run() {
		if(veces > 0 )//cuando llegue a 0 parara de crear hilos
		{
			this.setName("hilo " + veces);
			System.out.println("Soy" + getName()+":voy a llamar al hilo "+(veces - 1));
			HilosRecursivo hilo = new HilosRecursivo(veces-1);
			hilo.start();
		}else if (veces==0) {
			this.setName("Hilo " + veces);
			System.out.println("soy el "+getName());
		}
	}
}
