package com.ut.spice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ut.spice.model.ProductAvailability;

@Repository
public interface ProductAvailabilityRepository  extends CrudRepository<ProductAvailability, Long>{

	List<ProductAvailability> findAll();
}
