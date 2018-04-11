package com.pccw.digitalstore.iotapimock.dto;

public class DoorDTO {
	
	public DoorDTO() {
		
	}
	
	public DoorDTO(String action, boolean success) {
		this.action = action;
		this.success = success;
	}
	
	private String action;
	private boolean success;
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "DootDTO [action=" + action + ", success=" + success + "]";
	}
}
