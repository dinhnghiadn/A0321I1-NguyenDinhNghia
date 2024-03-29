package model.service;

import model.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findbyID(int id);

    void update(int id, Product product);

    void remove(int id);

}
