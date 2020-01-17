package com.designPattern.singlton;

public class SingeltonClassTest {

	public static void main(String args[]) {
		SingeltonClass singeltonClass = SingeltonClass.getSingeltonClass();
		SingeltonClass singeltonClass2 = SingeltonClass.getSingeltonClass();

		System.out.println(singeltonClass.hashCode() == singeltonClass2.hashCode());
		System.out.println(singeltonClass.equals(singeltonClass2));

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("runnable thread1 " + SingeltonClass.getSingeltonClass());
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("runnable thread2 " + SingeltonClass.getSingeltonClass());
			}
		});

		thread1.start();
		thread2.start();
	}

}
