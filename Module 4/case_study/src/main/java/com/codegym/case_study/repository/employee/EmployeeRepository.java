package com.codegym.case_study.repository.employee;

import com.codegym.case_study.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findAllByEmployeeNameContaining(String author, Pageable pageable);
}
