package model.service;

import model.bean.Customer;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer) throws SQLException;
    void delete(int id) throws SQLException;
    Map<String,String> create(Customer customer) throws SQLException;
}
