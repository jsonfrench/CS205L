package edu.monmouth.vehicle;

public class VehicleNode {
	
	private Vehicle vehicle;
	private VehicleNode next;
	
	public VehicleNode(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleNode getNext() {
		return next;
	}

	public void setNext(VehicleNode next) {
		this.next = next;
	}
	
}
