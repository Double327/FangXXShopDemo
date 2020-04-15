package cn.doublefloat.fangxxshop.service.impl;

import cn.doublefloat.fangxxshop.dao.ICategoryDao;
import cn.doublefloat.fangxxshop.dao.IGoodsDao;
import cn.doublefloat.fangxxshop.entity.Category;
import cn.doublefloat.fangxxshop.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/15 5:28 下午
 */
@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    @Qualifier("categoryDao")
    private ICategoryDao categoryDao = null;

    @Autowired
    @Qualifier("goodsDao")
    private IGoodsDao goodsDao = null;


    @Override
    public void addCategory(Category category) {

        categoryDao.addCategory(category);
    }

    @Override
    public void deleteCategoryById(String id) {
        categoryDao.deleteCategory(id);
    }

    @Override
    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryDao.findAllCategory();
    }

    @Override
    public List<Category> getCategoryForIndex() {
        List<Category> categories = categoryDao.findAllCategory();
        for (Category category : categories) {
            category.setGoodses(goodsDao.findGoodsByCategory(category.getId(), 4));
        }
        return categories;
    }


    @Override
    public Category getCategoryById(String id) {
        return categoryDao.findCategoryById(id);
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }
}
