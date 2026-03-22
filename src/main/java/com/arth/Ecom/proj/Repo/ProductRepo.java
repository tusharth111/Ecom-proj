package com.arth.Ecom.proj.Repo;

import com.arth.Ecom.proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  15 3/15/2026 10:37 AM
 Project Name : Ecom-proj
 ***/
@Repository
public interface ProductRepo  extends JpaRepository<Product,Integer> {
    @Query("SELECT p from Product p WHERE "+
            " LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword,'%'))OR "+
            " LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword,'%'))OR "+
            " LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword,'%'))OR "+
            " LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword,'%'))")
    List<Product> searchProducts(String keyword);
}
