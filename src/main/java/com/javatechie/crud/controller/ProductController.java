package com.javatechie.crud.controller;

import com.javatechie.crud.entity.Products;
import com.javatechie.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping("/addProduct")
    public Products addProduct(@RequestBody Products products){
        return productService.saveProduct(products);
    }
    @PostMapping("/addAllProducts")
    public List<Products> addAllProducts(@RequestBody List<Products> products){
        return productService.saveAllProduct(products);
    }
    @GetMapping("/findAllProduct")
    public List<Products> findAllProducts (){
        return productService.getAllProducts();
    }
    @GetMapping("/findProductById/{id}")
    public Products findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping("/findProductByName/{name}")
    public Products findProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteById(id);
    }
    @PutMapping("/update")
    public Products updateProductById(@RequestBody Products products){
        return productService.updateById(products);
    }
}
