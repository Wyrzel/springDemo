package com.sda.java.gda.demo.repository;

import com.sda.java.gda.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


   Page<Product> findByNameIgnoreCaseContainingAndPriceBetweenOrderByNameAsc (String name,
                                                                Double low, Double high, Pageable pageable);




}
