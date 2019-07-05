package 水果模型;

public class Daughter implements Runnable {

    private PV pv;
	
	public Daughter (PV pv) {
		this.pv = pv;
	}
	
	public void run() {
		while (true) {
			pv.P3(); //占用橘子许可
			System.out.println("女儿吃橘子");
			pv.V1(); //释放盘子许可
		}
	}
}
