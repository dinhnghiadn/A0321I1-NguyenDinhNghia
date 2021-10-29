package model.service.impl;

import model.bean.Product;
import model.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Iphone X", 50000,"Apple","Released"));
        products.put(2,new Product(2,"Samsung Galaxy S6", 20000,"Samsung","Not released yet"));
        products.put(3,new Product(3,"Iphone 13", 80000,"Apple","Sold out"));
        products.put(4,new Product(4,"Xiaomi 10", 90000,"Xiami","Released"));
        products.put(5,new Product(5,"Realme XT", 30000,"Oppo","Sold out"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);

    }

    @Override
    public Product findbyID(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }
}
