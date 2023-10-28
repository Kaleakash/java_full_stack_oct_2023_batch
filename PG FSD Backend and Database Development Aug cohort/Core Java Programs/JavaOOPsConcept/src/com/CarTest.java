package com;

public class CarTest {

	public static void main(String[] args) {
		//start();
//		String result;
//		Car innova = new Car();
//		innova.start();
//		result = innova.appliedGear(1);
//		System.out.println(result);
//		innova.moving();
//		innova.stop();
//		
//		Car bmw = new Car();
//		bmw.start();
//		result = bmw.appliedGear(1);
//		System.out.println(result);
//		bmw.moving();
//		bmw.stop();
		//int a;
		new Car();		// one memory created. ie heap memory 
		Car innova = new Car();
		//innova.displayCarDetails("Innova");
//		innova.wheel=4;
//		innova.colour="Gray";
//		innova.price=3400000;
		innova.setCarDetails(4, 3400000, "Gray");
		innova.displayCarDetails("Innova");
		
		Car santro = new Car();
		//santro.displayCarDetails("Santro");
//		santro.wheel=4;
//		santro.colour="Red";
//		santro.price=1200000;
		santro.setCarDetails(4, 1200000, "Red");
		santro.displayCarDetails("Santro");
		
		Car bmw = new Car(4,50000000,"White");
		bmw.displayCarDetails("BMW");
	}

}
