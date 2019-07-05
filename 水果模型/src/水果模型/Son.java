package 水果模型;

public class Son implements Runnable {

    private PV pv;
	
	public Son (PV pv) {
		this.pv = pv;
	}
	
	public void run() {
		while (true) {
			pv.P2(); //占用苹果许可
			System.out.println("儿子吃苹果");
			pv.V1(); //释放盘子许可
		}
	}
}
