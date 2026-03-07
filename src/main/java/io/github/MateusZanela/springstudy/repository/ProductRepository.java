package io.github.MateusZanela.springstudy.repository;

import io.github.MateusZanela.springstudy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByName(String name);

}
