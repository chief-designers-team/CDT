package 水果模型;

public class Mother implements Runnable {

    private PV pv;
    private int time; //剥橘子用时（毫秒）
	
	public Mother (PV pv,int time) {
		this.pv = pv;
		this.time = time;
	}
	
	public void run() {
		while (true) {
			try {
				pv.P1(); //占用盘子许可
				Thread.sleep(time); //剥橘子用时
				System.out.println("妈妈放橘子");
			    pv.V3(); //释放苹果许可
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
