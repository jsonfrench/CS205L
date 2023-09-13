package edu.monmouth.vehicle;

public class DriveVehicle {

	public static void main(String[] args) {
		
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

}
