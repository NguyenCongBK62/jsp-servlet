package com.shop.dao;

import java.util.List;
import com.shop.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
}
