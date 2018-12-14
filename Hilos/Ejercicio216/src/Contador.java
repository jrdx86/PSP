
public class Contador {
	private int count=0;
	
	public Contador(int count) {
		this.count=count;
	}
	
	public void incrementa() {
		count+=count;
		 
	}
	public void decrementa() {
		count-=count;
		
	}
	public void mostrarValor() {
		System.out.println("El valor de contador es "+count);
	}
	public int valor(int count) {
		return count;
		
	}
}
