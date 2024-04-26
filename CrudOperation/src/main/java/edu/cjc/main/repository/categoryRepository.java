package edu.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cjc.main.model.Category;
@Repository
public interface categoryRepository extends JpaRepository<Category, Integer> {

	public Category findBycategoryId(int categoryId);


}
