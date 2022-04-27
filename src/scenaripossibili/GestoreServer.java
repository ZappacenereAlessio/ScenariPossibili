package scenaripossibili;

public class GestoreServer {
	public static void main(String[] args) {
		Server s = new Server(2000);
		
		if(s!=null) {
			s.inAscolto();
			s.Scrivi("10");
			System.out.println("Client: "+s.Leggi());
		}
	}

}
