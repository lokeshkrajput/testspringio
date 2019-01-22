package com.test.spring.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.test.spring.domain.Employer;


public interface EmployerRepo extends CrudRepository<Employer, Integer>{
	
	public List<Employer> findByEmployeesName(@Param("name") String name);
	
	@RestResource(exported=false)
	public List<Employer> findByName(@Param("name") String name);
	
}
