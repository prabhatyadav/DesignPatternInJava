package com.designPattern.singlton;

public class SingeltonClass {

	// rule 1. make the constructor private;
	private SingeltonClass() {
		// default
	}

	// rule 2. create the private local instance of Class
	private static SingeltonClass singelton = null;

	// rule 3.create the public static method to make instance accessible to outside
	// the class because it the method is not static it needed the instance of class
	// to
	// call this method which is not be available because the constructor is the
	// private.
	public static SingeltonClass getSingeltonClass() {
		// rule 3.1 create the instance of the class
		if (null == singelton) {
			synchronized (SingeltonClass.class) {
				if (null == singelton) {
					singelton = new SingeltonClass();
				}
			}
		}
		return singelton;
	}

}
