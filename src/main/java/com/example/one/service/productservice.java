package com.example.one.service;

import com.example.one.Repositories.ProductRepo;
import com.example.one.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class productservice {
    @Autowired
    ProductRepo productRepo;
    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(101,"spring book",1000),
            new Product(102,"spring light",250),
            new Product(103,"spring chair",500),
            new Product(104,"spring table",2500)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int proId) {
        return products.stream().filter(pr -> pr.getProId()==proId).findFirst().get();
    }

    public void addproduct(Product pro){
        productRepo.save(pro);
    }

    public void updateproduct(Product pro) {
        int ind = IntStream.range(0, products.size())
                .filter(i -> products.get(i).getProId() == pro.getProId())
                .findFirst()
                .orElse(-1);
        products.set(ind,pro);
    }

    public void deleteproduct(int proid) {
        int ind = IntStream.range(0, products.size())
                .filter(i -> products.get(i).getProId() == proid)
                .findFirst()
                .orElse(0);
        products.remove(ind);
    }
}
