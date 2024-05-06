package com.example.h2;

import com.example.h2.model.Employee;
import com.example.h2.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class H2Application {

	public static void main(String[] args) {
		SpringApplication.run(H2Application.class, args);
		System.out.println("MAXXX IS READY");
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository employeeRepository) {
		return (args) -> {
			Employee emp1 = new Employee().builder().firstName("mani").lastName("kanta").build();
			Employee persistedEntity1 = employeeRepository.save(emp1);
			Optional<Employee> emp = employeeRepository.findById(persistedEntity1.getId());
			System.out.println("emp ::" + emp);
		};
	}
}
