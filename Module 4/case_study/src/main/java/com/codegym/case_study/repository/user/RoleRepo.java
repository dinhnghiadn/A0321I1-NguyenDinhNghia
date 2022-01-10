package com.codegym.case_study.repository.user;


import com.codegym.case_study.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Integer> {
}
