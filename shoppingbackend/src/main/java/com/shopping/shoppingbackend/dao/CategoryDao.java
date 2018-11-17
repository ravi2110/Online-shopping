package com.shopping.shoppingbackend.dao;

import java.util.List;

import com.shopping.shoppingbackend.dto.Category;

public interface CategoryDao {
	List<Category> list();

	Category get(int id);

}
