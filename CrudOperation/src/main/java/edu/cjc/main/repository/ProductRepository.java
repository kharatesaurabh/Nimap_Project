package edu.cjc.main.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import edu.cjc.main.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	

}
