package com.shop.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.shop.dao.INewsDAO;
import com.shop.model.NewsModel;
import com.shop.service.INewsService;

public class NewsService implements INewsService {
	@Inject
	private INewsDAO newsDAO;
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		return newsDAO.findByCategoryId(categoryId);
	}

}
