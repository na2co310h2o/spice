package com.ut.spice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ut.spice.model.Products;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Long>{
	
	List<Products> findAll();
	
	List<Products> findById(int id);
	
	List<Products> findByProductDescriptionEnglishContaining(String productDescriptionEnglish);
	
	List<Products> findByProductDescriptionEnglishLikeAndId(String productDescriptionEnglish, int id);
}
