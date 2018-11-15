import java.util.Scanner;

public class LanzaHilos205 {
	public static void main (String args[]) {
		Scanner tcl = new Scanner(System.in);
				
		System.out.println("Cuantos hilos deseas crea");
		int respuesta = tcl.nextInt();
		AcumulaHilos205 [] lista = new AcumulaHilos205[respuesta];
		
		for(int indice = 0; indice < respuesta; indice++){
			lista[indice] = new AcumulaHilos205(indice+1);
			lista[indice].start();
 		}
	}
}
