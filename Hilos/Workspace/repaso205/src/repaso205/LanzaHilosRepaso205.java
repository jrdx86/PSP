package repaso205;

import java.util.Scanner;

public class LanzaHilosRepaso205 {

	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		
		System.out.println("Cuantos hilos desea crear");
		int respuesta = tcl.nextInt();
		
		//Creamos el array de objetos de tipo FabricaHilos del tamaño acorde con la respuesta
		FabricaHilos [] lista = new FabricaHilos[respuesta];
		
		//Rellenamos y ejecutamos el array de objetos de tipo FabricaHilos
		for(int i = 0; i<respuesta;i++) {
			lista[i]= new FabricaHilos(i);
			lista[i].start();
		}
		
		}
		
	

}
