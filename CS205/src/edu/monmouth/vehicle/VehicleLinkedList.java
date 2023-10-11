package edu.monmouth.vehicle;

public class VehicleLinkedList {
	
	private VehicleNode head;
	private int size; 
	
	public VehicleLinkedList() {
		head = null;
		size = 0;
	}
	
	public void insert(Vehicle vehicle) {
		VehicleNode newNode = new VehicleNode(vehicle);
		newNode.setNext(head);
		head = newNode;
	}
	
	@Override
	public String toString() {
		StringBuilder return_string = new StringBuilder();
		VehicleNode temp = head;
		while(temp != null) {
			return_string.append(temp.getVehicle());
			return_string.append("\n");
			temp = temp.getNext();
		}
		return return_string.toString();
	}

}
