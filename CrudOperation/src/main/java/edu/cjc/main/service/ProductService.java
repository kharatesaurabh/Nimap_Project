package edu.cjc.main.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.cjc.main.model.Category;
import edu.cjc.main.model.Product;
import edu.cjc.main.repository.ProductRepository;
import edu.cjc.main.repository.categoryRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository pr;
	@Autowired
	categoryRepository cr;

	

	public Product getproductByid(int productid) {
		return pr.findById(productid).get();
	}

	public Product saveOrupdate(Product product) {
		    Category c  =   cr.findBycategoryId(product.getCategory().getCategoryId());
		    product.setCategory(c);
		 
		   return pr.save(product);
		
	}

	public List<Product> getallproducts(int page,int pagesize) {
		Pageable pageble=PageRequest.of(page, pagesize);
		Page<Product> pageproduct=pr.findAll(pageble);
		List<Product> productList=pageproduct.getContent();
		return productList;
	}

	public void deleteproduct(int productid) {
		pr.deleteById(productid);
		
	}

}
