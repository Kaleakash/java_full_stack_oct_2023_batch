package com;
abstract class Bike {
	abstract void speed();
	void mailage() {
		System.out.println("40km/lt");
	}
}
class Pulsar extends Bike {
	void color() {
		System.out.println("Red");
	}
	@Override
	void mailage() {
		System.out.println("30km/lt");
	}
	@Override
	void speed() {
		System.out.println("90km/hr");
	}
}
class Honda extends Bike {
	@Override
	void speed() {
		System.out.println("50km/hr");
	}
	void color() {
		System.out.println("Black");
	}
}
public class AbstractKeywordExample {
	public static void main(String[] args) {
	Honda hh = new Honda();		hh.color(); hh.speed(); hh.mailage();
	Pulsar pu = new Pulsar(); 	pu.color(); pu.speed(); pu.mailage();
	}
}
