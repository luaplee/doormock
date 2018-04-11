package com.pccw.digitalstore.iotapimock.services;

public interface DoorService {
	
	public boolean openDoor(String expectedResult);
	
	public boolean closeDoor(String expectedResult);

}
