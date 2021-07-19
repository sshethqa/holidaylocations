package com.natwest.holidaylocations.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.holidaylocations.domain.Cities;

@Repository
public interface CitiesRepo extends JpaRepository<Cities, Long> {

}
