package app.bookstore.model.service;

import app.bookstore.model.entity.Category;

import java.util.List;

public interface CategoryService {

	/**
	 * �������е�ͼ�����
	 * @return ͼ�������б�
	 */
	List<Category> getAllCategories();
}
