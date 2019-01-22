package com.test.spring;

import java.util.Arrays;
import java.util.List;

import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.test.spring.domain.Employee;
import com.test.spring.domain.Employer;
import com.test.spring.repo.EmployerRepo;

@SpringBootApplication
public class TestSpringIoApplication implements CommandLineRunner{

	@Autowired
	private EmployerRepo empRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(TestSpringIoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		
		
		
		List<Employee>  empList = Arrays.asList(new Employee[] {new Employee(1, "lokesh_rajput")});
		empRepo.save(new Employer(1, "Persi", empList));
		
		empList = Arrays.asList(new Employee[] {new Employee(2, "lokesh.rajput")});
		empRepo.save(new Employer(2, "GL", empList));
		
		empList = Arrays.asList(new Employee[] {new Employee(3, "lrajput")});
		empRepo.save(new Employer(3, "Sapient", empList));
		
		
		empRepo.findAll().forEach(i -> System.out.println(i));
		
		
	}
	
	@SuppressWarnings("rawtypes")
	@Bean
    ServletRegistrationBean h2servletRegistration(){
        @SuppressWarnings("unchecked")
		ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
	
	
}
