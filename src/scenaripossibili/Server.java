package scenaripossibili;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;
	Socket so;
	BufferedReader br;
	BufferedWriter bw;
	
	public Server(int porta) {
		try {
			ss = new ServerSocket(porta);
			System.out.println("Server in ascolto");
			CountDown cd = new CountDown(10);
			cd.start();
			ss.setSoTimeout(10000);
			
		} catch (BindException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void inAscolto() {
		try {
			so = ss.accept();
			System.out.println("Connessione stabilita");
			br = new BufferedReader(new InputStreamReader(so.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String Leggi() {
		String msg="";
		
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
