package com;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Pulsar extends Bike {
	void color() {
		System.out.println("Red");
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
public class MethodOverridingExamples {
	public static void main(String[] args) {
	Honda hh = new Honda();		hh.color(); hh.speed();
	Pulsar pu = new Pulsar(); 	pu.color(); pu.speed();
	}
}
