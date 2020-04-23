package com.shop.dao.impl;

import java.util.List;

import com.shop.dao.ICategoryDAO;
import com.shop.mapper.CategoryMapper;
import com.shop.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}
	
}
