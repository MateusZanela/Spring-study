package io.github.MateusZanela.springstudy.repository;

import io.github.MateusZanela.springstudy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
