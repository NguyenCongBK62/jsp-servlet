package com.shop.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.shop.dao.ICategoryDAO;
import com.shop.model.CategoryModel;
import com.shop.service.ICategoryService;

public class CategoryService implements ICategoryService  {
	@Inject
	private ICategoryDAO categoryDao;
	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
	
}
