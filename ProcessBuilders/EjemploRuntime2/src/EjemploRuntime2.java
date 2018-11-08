import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EjemploRuntime2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		Runtime runtime = Runtime.getRuntime();

		System.out.print("Teclea algo para detener el proceso:");

		try {
			Process process = runtime.exec(args
					,null, new File("/home/jorlop01/psp/EjemploRuntime/bin") );
			String respuesta = sc.nextLine();
			/*if (!Boolean.parseBoolean(respuesta)) {
				process.destroy();
				System.err.println("A fregar");
			}*/
			
			String nombre;
			nombre = sc.nextLine();
			sc.close();
		} catch (IOException ex) {
			System.err.println("Excepción de E/S");
			System.exit(-1);
		}
	}
}
