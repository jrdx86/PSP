//
public class hiloConParametros extends Thread {
	//Creamos una clase que hereda de thread y creamos una variable de clase
	
	private int veces = 0;
	//constructor con parametros,que recoge un hilo con nombre
	//
	
	public hiloConParametros(String nombre, int veces) {
		//se llama al constructor thread pasando nombre como parametro
		super(nombre);
		this.veces=veces;
	}
	public void run() {
		for(int i=1;i<=this.veces;i++) {
			//al extender thread podemos poner directamente getName()
			System.out.println("Ejecutando: "+getName()+" iteracion: "+i);
	}
}
}
