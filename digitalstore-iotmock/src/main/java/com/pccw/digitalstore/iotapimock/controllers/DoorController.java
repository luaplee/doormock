package com.pccw.digitalstore.iotapimock.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pccw.digitalstore.iotapimock.dto.DoorDTO;
import com.pccw.digitalstore.iotapimock.services.DoorService;
import com.pccw.digitalstore.iotapimock.services.exception.SampleException;

@RestController
@RequestMapping("/door")
public class DoorController {
	
	@Autowired
	DoorService doorService;
	
	@GetMapping("/open")
	public DoorDTO openDoor(@RequestParam(defaultValue = "success") String expected) {
		return new DoorDTO("open", doorService.openDoor(expected));
	}
	
	@GetMapping("/close")
	public ResponseEntity<DoorDTO> closeDoor(@RequestParam(defaultValue = "success") String expected) {
		return new ResponseEntity<>(new DoorDTO("close", doorService.closeDoor(expected)), HttpStatus.FOUND);
	}

}
