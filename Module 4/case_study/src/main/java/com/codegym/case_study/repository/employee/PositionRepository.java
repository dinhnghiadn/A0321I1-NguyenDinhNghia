package com.codegym.case_study.repository.employee;


import com.codegym.case_study.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PositionRepository extends JpaRepository<Position,Integer> {

}
