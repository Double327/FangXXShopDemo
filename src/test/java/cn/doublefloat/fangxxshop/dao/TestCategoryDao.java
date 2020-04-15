package cn.doublefloat.fangxxshop.dao;

import cn.doublefloat.fangxxshop.entity.Category;
import cn.doublefloat.fangxxshop.utils.XXShopUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/14 5:34 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestCategoryDao {

    @Autowired
    @Qualifier("categoryDao")
    private ICategoryDao categoryDao;

    @Test
    public void testAddCategory() {
        Category category = new Category(XXShopUtils.getId(), "女装", 0);
        categoryDao.addCategory(category);
    }

    @Test
    public void testDeleteCategory() {
        categoryDao.deleteCategory("0438d1e85ef7480181b2a9d19594c174");
    }

    @Test
    public void testUpdateCategory() {
        Category category = categoryDao.findCategoryById("df0d1b6ea4014d4f8ee6d823f0db9ee7");
        category.setGoodsNum(0);
        categoryDao.updateCategory(category);
    }

    @Test
    public void testFindAllCategory() {
        List<Category> categories = categoryDao.findAllCategory();
        for (Category category : categories) {
            System.out.println(category);
        }
    }

    @Test
    public void testFindCategoryById() {
        Category category = categoryDao.findCategoryById("df0d1b6ea4014d4f8ee6d823f0db9ee7");
        System.out.println(category);
    }

}
