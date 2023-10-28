package com;

public class Car {
	
int wheel;
float price;
String colour;
	Car() {
		System.out.println("Object created..");
		wheel = 4;
		price = 500000;
		colour="don't know";
	}
	// parameter constructor 
	Car(int wheel, float price, String colour) {
		this.wheel= wheel;		// this.wheel is instane and wheel is local 
		this.price = price;
		this.colour=colour;
		
	}
//	void setCarDetails(int wheel1, float price1, String colour1) {
//		wheel= wheel1;
//		price = price1;
//		colour=colour1;
//		
//	}
	void setCarDetails(int wheel, float price, String colour) {
		this.wheel= wheel;		// this.wheel is instane and wheel is local 
		this.price = price;
		this.colour=colour;
		
	}
	void start() {
		System.out.println("Car Start");
	}

	String appliedGear(int gear) {
	System.out.println("You applied "+gear+" gear");
	if(gear==1) {
		return "Speed of car is 10 Km/hr"; 
	}else if(gear==2) {
		return "Speed of car is 20 to 30 Km/hr";
	}else if(gear ==3) {
		return "Speed of car is 50 to 70 Km/hr";
	}else {
		return "Speed of car is more than 100 Km/hr";
	}
	}
	
	void moving() {
		System.out.println("Car is moving");
	}
		
	void stop() {
		System.out.println("Car stop");
	}

	void displayCarDetails(String name) {
		String carInfo="Car details "+name;				
		System.out.println(carInfo);
		System.out.println("Wheel "+wheel);
		System.out.println("Colour "+colour);
		System.out.println("Price "+price);
	}

}
