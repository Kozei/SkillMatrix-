package io.swagger.repository;

import io.swagger.dao.CategoryDao;
import io.swagger.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryRepositoryImpl implements CategoryRepository{

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getCategories() {
        return categoryDao.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryDao.findById(id).orElse(null);
    }

    @Override
    public Category addCategory(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public List<Category> addCategories(List<Category> categories) {
        return categoryDao.saveAll(categories);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        Category existingCategory = categoryDao.findById(id).orElse(null);
        existingCategory.setCategoryName(category.getCategoryName());
        categoryDao.save(existingCategory);
        return existingCategory;
    }

    @Override
    public void deleteCategory(Long id) {
        categoryDao.deleteById(id);
    }
}
