package com.test.spring.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.test.spring.domain.Employee;

@RepositoryRestResource(exported=false)
public interface EmployeeRepo extends PagingAndSortingRepository<Employee, String>{
	
	public List<Employee> findById(@Param("id") String id);
	
}
