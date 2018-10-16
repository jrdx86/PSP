import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class EjemploProcessBuilder2 {
	
	public static void main(String[] args) throws IOException {
		//Si no hay un programa a ejecutar pasado como para parametro avisamos
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		//Creamos un objeto ProceesBuilder pasando como parametro el comando
		ProcessBuilder pb = new ProcessBuilder(args);
		
		try {
			//asignamos el directorio de trabajo al objeto ProcessBuilder
			pb.directory(new File("/home/jorlop01/psp/EjemploRuntime/bin"));
			
			//ejecutamos el proceso devolviendo un objeto de tipo process
			Process process = pb.start();
			
			//Espero a que el proceso termine
			int retorno = process.waitFor();
			
			//Informamos sobre el resultado del proceso
			System.out.println("La ejecución de " + Arrays.toString(args) + " devuelve " + retorno);
		} catch (IOException ex) {
			
			System.err.println("Excepción de E/S");
			
			System.exit(-1);
		} catch (InterruptedException ex) {
			System.err.println("El proceso hijo finalizó de forma incorrecta");
		}
	}
}
