package scenaripossibili;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	Socket so;
	BufferedReader br;
	BufferedWriter bw;
	
	public Client(InetAddress ip, int porta) {
		try {
			so = new Socket(ip, porta);
			br = new BufferedReader(new InputStreamReader(so.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String Leggi() {
		String msg=" ";
		
		try {
			msg = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	
	public void Scrivi(String msg) {
		try {
			bw.write(msg+"\n");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
