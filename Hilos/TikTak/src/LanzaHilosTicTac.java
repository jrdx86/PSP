
public class LanzaHilosTicTac  {
	public static void main(String[] args) {
		Reloj reloj = new Reloj();
		HiloTic hiloTic = new HiloTic("HiloTic1", reloj, 6);
		
		HiloTac hiloTac = new HiloTac("HiloTac1", reloj, 6);

		hiloTic.start();
		
		hiloTac.start();
		
		
	}

}
