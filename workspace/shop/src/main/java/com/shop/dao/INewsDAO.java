package com.shop.dao;

import java.util.List;

import com.shop.model.NewsModel;

public interface INewsDAO extends GenericDAO<NewsModel> {
	List<NewsModel> findByCategoryId(Long categoryId);
}
