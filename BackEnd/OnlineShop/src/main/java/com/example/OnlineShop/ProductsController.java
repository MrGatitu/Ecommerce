package com.example.OnlineShop;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
public class ProductsController {

    private final ProductRepository productRepository;

    // @Autowired
    public ProductsController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @GetMapping("All")
    public Iterable<Products> findAllProducts(){
        return this.productRepository.findAll();
    }

    @GetMapping("Hello")
    public String Hello(){
        return "Hello, Welcomes to this Repository";
    }

}
