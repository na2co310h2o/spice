package com.ut.spice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4706809095730170858L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_description_english")
	private String productDescriptionEnglish;
	
	@Column(name="product_description_french")
	private String productDescriptionFrench;

	@Column(name="brand_name_english")
	private String brandNameEnglish;
	
	@Column(name="brand_name_french")
	private String brandNameFrench;
	
	@Column(name="product_type")
	private String productType;
	
	@Column(name="additional_product_identification")
	private String additionalProductIdentification;
	
	@Column(name="target_market")
	private String targetMarket;
	
	@Column(name="product_image_url")
	private String productImageUrl;
	
	@Column(name="status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductDescriptionEnglish() {
		return productDescriptionEnglish;
	}

	public void setProductDescriptionEnglish(String productDescriptionEnglish) {
		this.productDescriptionEnglish = productDescriptionEnglish;
	}

	public String getProductDescriptionFrench() {
		return productDescriptionFrench;
	}

	public void setProductDescriptionFrench(String productDescriptionFrench) {
		this.productDescriptionFrench = productDescriptionFrench;
	}

	public String getBrandNameEnglish() {
		return brandNameEnglish;
	}

	public void setBrandNameEnglish(String brandNameEnglish) {
		this.brandNameEnglish = brandNameEnglish;
	}

	public String getBrandNameFrench() {
		return brandNameFrench;
	}

	public void setBrandNameFrench(String brandNameFrench) {
		this.brandNameFrench = brandNameFrench;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAdditionalProductIdentification() {
		return additionalProductIdentification;
	}

	public void setAdditionalProductIdentification(String additionalProductIdentification) {
		this.additionalProductIdentification = additionalProductIdentification;
	}

	public String getTargetMarket() {
		return targetMarket;
	}

	public void setTargetMarket(String targetMarket) {
		this.targetMarket = targetMarket;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
