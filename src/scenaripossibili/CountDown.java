package scenaripossibili;

public class CountDown extends Thread{
	private int tempo;
	
	public CountDown(int t) {
		this.tempo = t;
	}
	
	public void Run() {
		for(int i = tempo; i>0; i--) {
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
