package com.designPattern.factory;

public class FactoryClassTest {
 public static void main(String args[]) {
	 FactoryClass factoryClass = new FactoryClassImpl();
	 Car car =factoryClass.getCar("BMW");
	 car.getCarName();
	 Car car2 =factoryClass.getCar("AUDI");
	 car2.getCarName();
 }
}
