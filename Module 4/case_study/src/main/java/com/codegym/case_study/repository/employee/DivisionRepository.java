package com.codegym.case_study.repository.employee;

import com.codegym.case_study.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division,Integer> {
}
