package edu.monmouth.vehicle;

public class DriveVehicle {

	public static void main(String[] args) {
		
		VehicleLinkedList list = new VehicleLinkedList();
		list.insert(new Boat(20));
		list.insert(new Boat(20));
		list.insert(new Car(4));
		System.out.printf("%s%n", list);
	}
		/*
		final int MAX = 4; 
		
		Vehicle[] vehicles = new Vehicle[MAX];
		
		vehicles[0] = new Boat(22);
		vehicles[1] = new Boat(20);
		vehicles[2] = new Car(4);
		vehicles[3] = new Car(3);
		
		for(Vehicle vehicle : vehicles) {
			vehicle.go();
			vehicle.stop();
		}
		
		for(int i = 0; i < vehicles.length; i++) {
			vehicles[i].go();
			vehicles[i].stop();
		}
		
		System.exit(MAX);
		
		Car myCar = new Car(); 
		Boat myBoat = new Boat(17); 
		
		makeItGo(myBoat); 
		makeItGo(myCar); 
		
		Vehicle v; 
		v = new Boat(); 
		v = new Car(4); 
		
		makeItGo(v);
				
	}
	
	public static void makeItGo(Vehicle vehicle) {
		vehicle.go(); 		
	}

	public static void makeItStop(Vehicle vehicle) {
		vehicle.stop(); 		
	}
	
	*/

}
