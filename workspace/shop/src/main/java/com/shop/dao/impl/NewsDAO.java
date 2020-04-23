package com.shop.dao.impl;

import java.util.List;

import com.shop.dao.INewsDAO;
import com.shop.mapper.NewsMapper;
import com.shop.model.NewsModel;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDAO {

	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryId = ?";
		return query(sql, new NewsMapper(), categoryId);
	}

}
