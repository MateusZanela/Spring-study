package io.github.MateusZanela.springstudy.controller;

import io.github.MateusZanela.springstudy.model.Product;
import io.github.MateusZanela.springstudy.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("product")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        System.out.println("Product received: "+product);

        String id = UUID.randomUUID().toString();

        product.setId(id);

        productRepository.save(product);
        return product;
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable("id") String id){
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable String id){
        productRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void updateProduct(@PathVariable("id") String id,
                              @RequestBody Product product){
        product.setId(id);
        productRepository.save(product);

    }

}
