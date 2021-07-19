package com.natwest.holidaylocations.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.natwest.holidaylocations.domain.Cities;
import com.natwest.holidaylocations.repo.CitiesRepo;

@Service
public class CitiesService {
	
	private CitiesRepo repo;
	
	public CitiesService(CitiesRepo repo) {
		this.repo= repo;
		
		
	}
	
	public Cities create(Cities ct) {
		return this.repo.saveAndFlush(ct);
		
	}
	public List<Cities> read() {
		return this.repo.findAll();
		
	}
	
	public Cities update(Long id, Cities newCt) {
		Cities existing = this.repo.getById(id);
		existing.setName(newCt.getName());
		existing.setContinent(newCt.getContinent());
		existing.setNoOfVisitors(newCt.getNoOfVisitors());
		existing.setHasBeach(newCt.isHasBeach());
		
		Cities updated = this.repo.save(existing);
		return updated;
		
	}
	
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);

	}
	
}
