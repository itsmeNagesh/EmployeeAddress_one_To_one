package com.Nagesh.EmployeeAndAddress.repo;

import com.Nagesh.EmployeeAndAddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Optional<Employee> findById(Long id);
}
