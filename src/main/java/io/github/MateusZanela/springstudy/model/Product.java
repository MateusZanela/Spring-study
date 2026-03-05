package io.github.MateusZanela.springstudy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
    POJO Class
*/
@Getter
@Setter
@ToString
public class Product {

    private String id;
    private String name;
    private String description;
    private Double price;

}
