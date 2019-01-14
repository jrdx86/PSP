
public class LanzaHilos220 {
	public static void main(String[] args) {
		reloj rel = new reloj();
		HiloTik ht1 = new HiloTik("Tic", rel , 3);
		HiloTak ht2 = new HiloTak("Tac", rel , 3);
		
		ht1.start();
		ht2.start();
		
	}

}
