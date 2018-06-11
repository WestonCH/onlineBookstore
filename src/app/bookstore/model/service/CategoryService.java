package app.bookstore.model.service;

import app.bookstore.model.entity.Category;

import java.util.List;

public interface CategoryService {

	/**
	 * 返回所有的图书分类
	 * @return 图书分类的列表
	 */
	List<Category> getAllCategories();
}
