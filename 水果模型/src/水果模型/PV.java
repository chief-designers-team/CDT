package 水果模型;

import java.util.concurrent.Semaphore;

public class PV {

	private Semaphore plate = new Semaphore(1); //盘子信号量，初始化为1
	private Semaphore hasApple = new Semaphore(0); //有苹果信号量
	private Semaphore hasOrange = new Semaphore(0); //有橘子信号量
	
	//盘子P方法
	public void P1() {
		try {
            plate.acquire();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	//拿苹果P方法
	public void P2() {
		try {
            hasApple.acquire();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	//拿橘子P方法
	public void P3() {
		try {
            hasOrange.acquire();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	//盘子V方法
	public void V1() {
		plate.release();
	}
	
	//拿苹果V方法
	public void V2() {
		hasApple.release();
	}
	
	//拿橘子V方法
	public void V3() {
		hasOrange.release();
	}
}
