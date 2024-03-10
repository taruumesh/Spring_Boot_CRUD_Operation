package com.javatechie.crud.repo;

import com.javatechie.crud.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {
    static Products findByName(String name){
        return null;
    }

}
