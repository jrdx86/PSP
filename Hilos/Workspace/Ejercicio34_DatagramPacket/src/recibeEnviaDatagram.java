import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class recibeEnviaDatagram {
	public static void main(String[] args) {
		try {
			
			System.out.println("Creando socket datagrama");
			InetSocketAddress addr = new InetSocketAddress ("192.168.26.112", 5555);
			DatagramSocket datagramSocket = new DatagramSocket(addr);
			
			System.out.println("Recibiendo mensaje");
			byte[] mensaje2 = new byte[25];
			DatagramPacket datagrama1 = new DatagramPacket (mensaje2, 25);
			datagramSocket.receive (datagrama1);
			
			System.out.println("Mensaje recibido: "+ new String (mensaje2));
			System.out.println("Enviando mensaje");
			String mensaje = "puton, aaaparcao ";
			InetAddress addr2 = InetAddress.getByName("192.168.26.111");
			DatagramPacket datagrama2 = new DatagramPacket(mensaje.getBytes(), mensaje.getBytes().length, addr2, 5555);
			datagramSocket.send(datagrama2);
			
			System.out.println("Mensaje enviado");
			
			System.out.println("Cerrando el socket datagrama");
			datagramSocket.close();
			
			System.out.println("Terminado");
	} catch (IOException e) {
	e.printStackTrace();
	}
}
}
