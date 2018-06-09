package com.sda.java.gda.demo.repository;

import com.sda.java.gda.demo.model.Recipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReciptRepository extends JpaRepository<Recipt, Long> {

   // List<Recipt> findBy
}
