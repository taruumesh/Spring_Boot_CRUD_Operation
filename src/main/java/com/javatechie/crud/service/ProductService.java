package com.javatechie.crud.service;

import com.javatechie.crud.entity.Products;
import com.javatechie.crud.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Products saveProduct(Products products){
      return productRepository.save(products);
    }

    public List<Products> saveAllProduct(List<Products> products){
        return productRepository.saveAll(products);
    }

    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }

    public Products getProductById(int id){
      //  return productRepository.getReferenceById(id);
       return productRepository.findById(id).orElse(null);
    }

    public Products getProductByName(String name){
        ProductRepository.findByName(name);
    }

    public String deleteById(int id){
        productRepository.deleteById(id);
        return "product deleterd!!"+ id;
    }

    public Products updateById(Products products){
       Products existingProduct = productRepository.getById(products.getId());
       existingProduct.setId(products.getId());
       existingProduct.setName(products.getName());
       existingProduct.setQuantity(products.getQuantity());
       existingProduct.setPrice(products.getPrice());
       return productRepository.save(existingProduct);
    }
}
