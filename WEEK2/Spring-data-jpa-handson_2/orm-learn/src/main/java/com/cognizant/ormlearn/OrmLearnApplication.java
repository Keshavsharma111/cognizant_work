package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        // ================= QUERY METHODS =================
        System.out.println("\n========== Query Method 1 ==========");
        countryRepository.findByNameContaining("ia")
                .forEach(System.out::println);

        System.out.println("\n========== Query Method 2 ==========");
        countryRepository.findByNameContainingOrderByNameAsc("ia")
                .forEach(System.out::println);

        System.out.println("\n========== Query Method 3 ==========");
        countryRepository.findByNameStartingWith("I")
                .forEach(System.out::println);

        // ================= O/R MAPPING =================
        System.out.println("\n========== Employee Details ==========");

        Employee employee = employeeRepository.findById(1).orElse(null);

        if (employee != null) {
            System.out.println(employee);
            System.out.println(employee.getDepartment());
            System.out.println(employee.getSkillList());
        } else {
            System.out.println("Employee not found!");
        }
    }
}