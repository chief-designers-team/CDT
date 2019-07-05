package 水果模型;

public class EatFruit { //运行

	public static void main(String[] args) {
		//创建共用PV类
		PV pv = new PV();
		
		Father fa = new Father(pv,1000);
		Mother mo = new Mother(pv,850);
		Son son = new Son(pv);
		Daughter dau = new Daughter(pv);
		
		//创建线程
		Thread t0 = new Thread(fa);
		Thread t1 = new Thread(mo);
		Thread t2 = new Thread(son);
		Thread t3 = new Thread(dau);
		
		//启动线程
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
