package products.repositories;

import org.springframework.stereotype.Component;
import products.entites.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Добавлен новый продукт");
    };

    public Product getProdById(String id){

        for (Product prod:products) {
            if (prod.getId().equals(id)) return prod;
        }
        return null;
    }

    public List<Product> getAllProds(){
        return products;
    }

}
