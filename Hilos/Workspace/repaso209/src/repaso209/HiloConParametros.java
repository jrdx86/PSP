package repaso209;

public class HiloConParametros extends Thread {
	public String txt;
	public int num;
	
	public HiloConParametros(String txt, int num) {
		this.txt = txt;
		this.num = num;		
	}
	public void run() {
		for(int i = 0; i<this.num;i++)
			System.out.println(txt);
		
	}
}
