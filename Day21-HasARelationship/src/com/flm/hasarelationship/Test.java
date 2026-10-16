package com.flm.hasarelationship;

public class Test {

	public static void main(String[] args) {
		Car car=new Car();
		car.brand="Tata";
		car.model="punch";
		car.price=800000;
		Engine engine=new Engine();
		engine.capacity=1200;
		engine.fuelType="petrol";
		car.engine=engine;
		System.out.println(car.model);
		System.out.println(car.brand);
		System.out.println(car.price);
		System.out.println(car.engine);
		System.out.println(car.engine.capacity);
		System.out.println(car.engine.fuelType);
		System.out.println(car);
		System.out.println("====================");
		Engine engine2=new Engine("diesel",120);

		Car car2=new Car("Tata","nexon",1000000,engine2);
		System.out.println(car2);
		
		System.out.println("====================");
		Car car3=new Car("Tata","siara",1000000,new Engine("CNG",100));
		System.out.println(car3);


	}

}
