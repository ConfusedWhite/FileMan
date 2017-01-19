package cn.com.liboke.boy;

import java.awt.EventQueue;

public class threadBoy implements Runnable {

	private Thread thread;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void Initialization(){
		thread = new Thread(this);
	}
	public void sleep() throws InterruptedException{
		thread.sleep(3000);
	}
}
