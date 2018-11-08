import java.io.* ;
import java.util.*;

public class EjemploStream2 {
	public static void main(String[] args) throws IOException {
			
			
			ProcessBuilder pb = new ProcessBuilder("ls", "-z");
			Process process = pb.start();
				
			InputStream is = process.getInputStream();
			InputStream err = process.getErrorStream();
			
			InputStreamReader isr = new InputStreamReader(is);
			InputStreamReader isr2 = new InputStreamReader(err);
					
			BufferedReader br = new BufferedReader(isr);
			BufferedReader br2 = new BufferedReader(isr2);
			
			String line;
			System.out.println("Salida del proceso " + Arrays.toString(args) + " :" ) ;
			
			while((line=br.readLine())!= null ) {
			System.out.println(line);
			}
			
			while((line=br2.readLine())!= null ) {
				System.out.println(line);
		}
	}
}
