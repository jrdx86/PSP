package repaso204;

public class Fibonazi extends Thread {
	public int n;
	
	public Fibonazi(int n) {
		this.n= n;
	}
	
	public void run() {
		int n1 = 0;
        int n2 = 1;
        int aux;
        
        for(int indice = 1; indice<=n; indice++) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;

            System.out.println(n2);
	}

}
}