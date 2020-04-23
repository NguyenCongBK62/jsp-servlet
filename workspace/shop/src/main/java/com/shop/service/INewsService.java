package com.shop.service;

import java.util.List;

import com.shop.model.NewsModel;

public interface INewsService {
	List<NewsModel> findByCategoryId(Long categoryId);
}
