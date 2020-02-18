package products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import products.entites.Product;
import products.repositories.ProductsRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductsRepository repo;

    @Autowired
    public void setProductRepo(ProductsRepository productsRepository){
        this.repo = productsRepository;
    }

    public Product getProductById(String id){
        Product product = repo.getProdById(id);
        return product;
    }

    public List<Product> getAllProds(){
        return repo.getAllProds();
    }

    public void addProduct(Product product){
        repo.addProduct(product);
    }


}
