package io.github.MateusZanela.springstudy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
    POJO Class
*/
@Getter
@Setter
@ToString
@Entity
@Table(name = "item")
public class Product{

    @Id
    @Column(name = "item_id")
    private String id;

    @Column(name = "item_name")
    private String name;

    @Column(name="item_description")
    private String description;

    private Double price;

}
