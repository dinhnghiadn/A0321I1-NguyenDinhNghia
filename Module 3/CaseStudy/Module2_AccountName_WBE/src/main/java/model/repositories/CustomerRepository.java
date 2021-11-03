package model.repositories;

import model.bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();
    Customer findById(int id);
    void deleteCustomer(int id);
    void updateCustomer (Customer customer) throws SQLException;
    void insertCustomer(Customer customer) throws SQLException;


}
