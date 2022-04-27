package scenaripossibili;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GestoreClient {
	public static void main(String[] args) {
		
		try {
			Client c = new Client(InetAddress.getLocalHost(), 2000);
			System.out.println("Client connesso");
			String str = c.Leggi();
			CountDown cd = new CountDown(10);
			cd.start();
			System.out.println("Server: messaggio metodo leggi(): "+str);
			c.Scrivi("sinc");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
