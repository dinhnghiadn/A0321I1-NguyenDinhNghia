package com.codegym.case_study.repository.user;

import com.codegym.case_study.model.Role;
import com.codegym.case_study.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepo extends JpaRepository<Role,Integer> {
    List<Role> findByUsers(User user);
}
