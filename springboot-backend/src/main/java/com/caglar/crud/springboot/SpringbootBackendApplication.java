package com.caglar.crud.springboot;

import com.caglar.crud.springboot.model.Employee;
import com.caglar.crud.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Mert");
		employee.setLastName("Çağlar");
		employee.setEmailId("mertcaglar@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Çınar");
		employee1.setLastName("Günbatar");
		employee1.setEmailId("cinargunbatar@gmail.com");
		employeeRepository.save(employee1);

	}
}
