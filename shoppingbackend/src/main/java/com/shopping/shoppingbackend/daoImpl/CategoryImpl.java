package com.shopping.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.shopping.shoppingbackend.dao.CategoryDao;
import com.shopping.shoppingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryImpl implements CategoryDao {

	public static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		// adding first Category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.png");
		categories.add(category);

		// adding Second Category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile");
		category.setImageURL("CAT_2.png");
		categories.add(category);

		// adding Third Category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for Laptop");
		category.setImageURL("CAT_3.png");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		//enhanced for loop
		for(Category category:categories){
			if(category.getId()==id)
				return category;
		}
		return null;
	}

}
