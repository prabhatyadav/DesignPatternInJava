package com.designPattern.factory;

public class FactoryClassImpl extends FactoryClass {
	public FactoryClassImpl() {
		// it will call the default method of the abstract class
	}

	@Override
	Car getCar(String carName) {
		// what logic should come here so that we
		if (carName.equalsIgnoreCase("BMW")) {
			return new Bmw();
		} else if (carName.equalsIgnoreCase("AUDI")) {
			return new Audi();
		} else {
			return null;
		}
	}

}
