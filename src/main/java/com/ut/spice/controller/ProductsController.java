package com.ut.spice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ut.spice.model.ProductAvailability;
import com.ut.spice.model.Products;
import com.ut.spice.repository.ProductAvailabilityRepository;
import com.ut.spice.repository.ProductsRepository;

@RestController
@RequestMapping("products-ut-wo-db/rest") // http://localhost:8080
public class ProductsController {
	
	Map<Integer, Products> puid = new HashMap<Integer, Products>();
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@Autowired
	private ProductAvailabilityRepository productAvailibilityRepository;
	
	//q1
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/availableProducts")
	public ResponseEntity<ProductAvailability> getAvailableProducts() {
		
		ProductAvailability productAvailibility = productAvailibilityRepository.findAll().get(0);
		
		return new ResponseEntity<ProductAvailability>(productAvailibility,HttpStatus.OK);
	}
	
	//q2
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/products")
	public ResponseEntity<List<Products>> getAllProducts() {

		List<Products> products = productsRepository.findAll();

		return new ResponseEntity<List<Products>>(products,HttpStatus.OK);
	}
	
	//q3
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "product/{pid}")
	public ResponseEntity<Products> getProductId(@PathVariable int pid) {
	
		Products products = productsRepository.findById(pid).get(0);
		
		return new ResponseEntity<Products>(products,HttpStatus.OK);
	}
	
	//q4
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "product/productDescriptionEnglish/{pEngDesc}")
	public ResponseEntity<List<Products>> getProductDesceriptionEnglish(@PathVariable String pEngDesc) {
		
		List<Products> products = productsRepository.findByProductDescriptionEnglishContaining(pEngDesc);
		
		return new ResponseEntity<List<Products>>(products,HttpStatus.OK);
	}
	
	//q5
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "product/{pid}/productIdAndProductDescriptionEnglish/{pEngDesc}")
	public ResponseEntity<List<Products>> getProductDesceriptionEnglish(@PathVariable int pid, @PathVariable String pEngDesc) {
		
		List<Products> products = productsRepository.findByProductDescriptionEnglishLikeAndId(pEngDesc, pid);
		
		return new ResponseEntity<List<Products>>(products,HttpStatus.OK);
	}
	
	//q6
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path="product/create")
	public ResponseEntity<Products> createProduct(@RequestBody Products productDetails) {
		
		
		/*
		 * String productId = UUID.randomUUID().toString(); newProduct.setId(productId);
		 * if (puid == null) { puid = new HashMap<>(); puid.put(productId, newProduct);
		 * }
		 */
		
		Products newProduct = productsRepository.save(productDetails);
		
		Products product = productsRepository.findById(productDetails.getId()).get(0);
		
		if (product != null) {
			return new ResponseEntity<Products>(product,HttpStatus.OK);
		} else {
			return null;
		}
	}
	
}
