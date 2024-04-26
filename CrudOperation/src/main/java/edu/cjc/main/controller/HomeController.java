package edu.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.cjc.main.model.Category;
import edu.cjc.main.model.Product;
import edu.cjc.main.service.CategoryService;
import edu.cjc.main.service.ProductService;

@RestController
public class HomeController {

	@Autowired
	CategoryService cs;
	@Autowired
	ProductService ps;
	@GetMapping("/api/categories")
	public List<Category> getallcategory(@RequestParam (value = "page",defaultValue = "0",required = false)Integer page){
		
		return cs.getallcategory(page,1);
	}
	@DeleteMapping("/api/categories/{di}")
	public void deleteCategoryById(@PathVariable("di") int categoryid) {
		cs.deleteCategoryById(categoryid);
	
	}
	@GetMapping("/api/categories/{di}")
	public Category getcategory(@PathVariable("di") int categoryid) {
		return cs.getcategoryByid(categoryid);
		
	}
	 
	@PutMapping("/api/categories/{di}")
	public void updateCategory(@RequestBody Category category){
	
		cs.saveOrupdate(category);
	
		
		
	}
	@PostMapping("/api/categories")
	public void saveCategories(@RequestBody Category category) {
		
		cs.saveOrupdate(category);
	}
	@GetMapping("/api/products")
	public List<Product> getallproduct(@RequestParam(value = "page",defaultValue = "0",required = false)Integer page){
		return ps.getallproducts(page,1);
	}
	
	@DeleteMapping("/api/products/{di}")
	public void deleteProduct(@PathVariable("di") int productId) {
		ps.deleteproduct(productId);
	
	}
	@GetMapping("/api/products/{di}")
	public Product getproduct(@PathVariable("di") int productId) {
		return ps.getproductByid(productId);
		
	}
	 
	@PutMapping("/api/products/{di}")
	public void updateproduct(@RequestBody Product product){
		ps.saveOrupdate(product);
		
		
	}
	@PostMapping("/api/products")
	public Product saveProducts(@RequestBody Product product) {
		return ps.saveOrupdate(product);
	}
	
}
