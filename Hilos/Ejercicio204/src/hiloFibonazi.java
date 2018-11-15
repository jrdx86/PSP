
public class hiloFibonazi extends Thread{
	public int veces=0;
	
	public hiloFibonazi(int veces) {
		this.veces=veces;
	}
	public void run() {
		int n1 = 0;
        int n2 = 1;
        int aux;
        
        for(int indice = 1; indice<=veces; indice++) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;

            System.out.println(n2);
        }
    }
		
	}

