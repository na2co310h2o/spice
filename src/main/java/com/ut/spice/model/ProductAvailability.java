package com.ut.spice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductAvailability implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3288129857760380177L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "availability_id")
	private Integer availabilityId;
	
	@Column(name = "available_products")
	private Integer availableProducts;
	
	@Column(name = "unused_products")
	private Integer unusedProducts;

	public Integer getAvailabilityId() {
		return availabilityId;
	}

	public void setAvailabilityId(Integer availabilityId) {
		this.availabilityId = availabilityId;
	}

	public Integer getAvailableProducts() {
		return availableProducts;
	}

	public void setAvailableProducts(Integer availableProducts) {
		this.availableProducts = availableProducts;
	}

	public Integer getUnusedProducts() {
		return unusedProducts;
	}

	public void setUnusedProducts(Integer unusedProducts) {
		this.unusedProducts = unusedProducts;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
