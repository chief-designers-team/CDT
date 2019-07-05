package 水果模型;

public class Father implements Runnable {
	
	private PV pv;
	private int time; //削苹果用时（毫秒）
	
	public Father (PV pv,int time) {
		this.pv = pv;
		this.time = time;
	}
	
	public void run() {
		while (true) {
			try {
				pv.P1(); //占用盘子许可
				Thread.sleep(time); //削苹果用时
				System.out.println("爸爸放苹果");
			    pv.V2(); //释放苹果许可
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
