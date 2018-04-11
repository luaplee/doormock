package com.pccw.digitalstore.iotapimock.services;

import org.springframework.stereotype.Service;

@Service
public class DoorServiceImpl implements DoorService {
	
	private final static String SUCCESS_RESULT = "success"; 
	
	@Override
	public boolean openDoor(String expectedResult) {
		return mockDoorResult(expectedResult);

	}

	@Override
	public boolean closeDoor(String expectedResult) {
		return mockDoorResult(expectedResult);
	}
	
	private boolean mockDoorResult(String expectedResult) {
		if(SUCCESS_RESULT.equalsIgnoreCase(expectedResult) || expectedResult == null) {
			return true;
		}
		return false;
	}

}
