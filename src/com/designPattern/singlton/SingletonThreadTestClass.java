package com.designPattern.singlton;

public class SingletonThreadTestClass implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			SingeltonClass.getSingeltonClass();
		}
	}

}
