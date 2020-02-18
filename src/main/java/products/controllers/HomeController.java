package products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import products.entites.Product;
import products.service.ProductService;

import java.util.List;

@Controller
public class HomeController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping("/form")
    public String showProdForm(Model uiModel){
        Product product = new Product();
        uiModel.addAttribute("product",product);
        return "product-form";
    }

    @PostMapping("/resultForm")
    public String resultForm(@ModelAttribute("product") Product product){
        productService.addProduct(product);
        return "product-form-result";
    }

    @GetMapping("/allProducts")
    public String showAllProds(Model uiModel){
        List<Product> products = productService.getAllProds();
        uiModel.addAttribute("products",products);
        return "product-all";
    }


    @GetMapping("/product/{id}")
    @ResponseBody
    public Product getProductById(@PathVariable(value = "id") String id){
        return productService.getProductById(id);
    }



}