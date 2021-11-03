package model.service.impl;

import model.bean.Customer;
import model.repositories.CustomerRepository;
import model.repositories.impl.CustomerRepoImpl;
import model.service.CustomerService;
import model.service.common.Validator;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepoImpl();

    @Override
    public void delete(int id) throws SQLException {
        customerRepository.deleteCustomer(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) throws SQLException {
        customerRepository.updateCustomer(customer);

    }

    @Override
    public Map<String, String> create(Customer customer) throws SQLException {
        Map<String, String> mapMessage = new HashMap<>();
        if (Validator.validateName(customer.getName())!= null ||
        Validator.validateEmail(customer.getEmail())!= null){
            mapMessage.put("name",Validator.validateName(customer.getName()) );
            mapMessage.put("email",Validator.validateEmail(customer.getEmail()) );
        }else {
            customerRepository.insertCustomer(customer);
        }
        return mapMessage;
    }
}
