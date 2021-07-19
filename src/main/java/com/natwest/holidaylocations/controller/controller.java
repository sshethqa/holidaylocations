package com.natwest.holidaylocations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.holidaylocations.domain.Cities;
import com.natwest.holidaylocations.service.CitiesService;

@RestController
@RequestMapping("/holiday")
public class controller {
	
	private CitiesService service;
	
	@Autowired
	public controller(CitiesService service) {
		this.service = service;
	}
	

	
	
	@PostMapping ("/createHoliday")
	public ResponseEntity<Cities> create(@RequestBody Cities ct) {
		return new ResponseEntity<Cities>(this.service.create(ct), HttpStatus.CREATED);
	}
	@GetMapping ("/readHoliday")
	public ResponseEntity<List<Cities>> read() {
		return new ResponseEntity<List<Cities>>(this.service.read(), HttpStatus.OK);
	}
	
	
	@PutMapping ("/replaceHoliday/{id}")
	public ResponseEntity<Cities> update(@PathVariable Long id, @RequestBody Cities ct) {
	return new ResponseEntity<Cities>(this.service.update(id, ct), HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping ("/deleteHoliday/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
		
	
	
	}
	
}
