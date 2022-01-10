package com.codegym.case_study.repository.user;


import com.codegym.case_study.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {
    User findByUserName(String userName);
    User findByEmployee_EmployeeEmail(String  email);
}
