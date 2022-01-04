package io.swagger.repository;

import io.swagger.dao.CategoryDao;
import io.swagger.model.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> getCategories();

    Category getCategoryById(Long id);

    Category addCategory(Category category);

    List<Category> addCategories(List<Category> categories);

    Category updateCategory(Long id, Category category);

    void deleteCategory(Long id);

}
