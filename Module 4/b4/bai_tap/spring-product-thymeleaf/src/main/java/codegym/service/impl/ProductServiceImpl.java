package codegym.service.impl;

import codegym.model.Product;
import codegym.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone", 200000, "Còn hàng"));
        products.put(2, new Product(2, "Samsung Note", 150000, "Hết hàng"));
        products.put(3, new Product(3, "Oppo X", 200000, "Còn hàng"));
        products.put(4, new Product(4, "Nokia 12", 200000, "Hết hàng"));
        products.put(5, new Product(5, "Vertu 10", 800000, "Chưa ra"));
        products.put(6, new Product(6, "Xiaomi 9", 200000, "Còn hàng"));
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
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
    products.put(id,product);
    }

    @Override
    public void remove(int id) {
    products.remove(id);
    }
}
