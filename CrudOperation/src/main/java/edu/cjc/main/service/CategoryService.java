package edu.cjc.main.service;


import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
public class CategoryService {

	@Autowired
	categoryRepository cr;
	@Autowired
	ProductRepository pr;
	
	public List<Category> getallcategory(int page,int pagesize) {
		
		Pageable p=PageRequest.of(page,pagesize);
		Page<Category> pageCategory=cr.findAll(p);
		List<Category> categoryList=pageCategory.getContent();
		return categoryList;
	}


	public void saveOrupdate(Category category) {
		
			  cr.save(category);
		  
		}
		public Category getcategoryByid(int categoryid) {
		return cr.findById(categoryid).get();
		
	}

		public void deleteCategoryById(int categoryid) {
			cr.deleteById(categoryid);
			
		}

	

	

	

}
