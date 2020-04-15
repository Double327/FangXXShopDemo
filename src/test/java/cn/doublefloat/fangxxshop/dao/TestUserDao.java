package cn.doublefloat.fangxxshop.dao;

import cn.doublefloat.fangxxshop.entity.User;
import cn.doublefloat.fangxxshop.utils.XXShopUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/12 6:26 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserDao {

    @Autowired
    @Qualifier("userDao")
    private IUserDao userDao = null;

    @Before
    public void init() {

    }
    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(XXShopUtils.getId());
        user.setName("testUser");
        user.setEmail("13451234@qq.com");
        user.setPassword("testuser");
        user.setPhoneNum("12345678900");

        user.setMoney(0.0);
        user.setRole("u");
        user.setRegTime("2000-3-3");
        userDao.addUser(user);
    }

    @Test
    public void testDeleteUserById() {
        userDao.deleteUserById("307f42596d74437ab1c21dbf1f59b590");
    }

    @Test
    public void testUpdateUser() {
        User user = userDao.findUserById("36e57693959447f78450899557b63da1");
        user.setName("double");
        userDao.updateUser(user);
    }

    @Test
    public void testUpdateUserAvatar() {
        userDao.updateAvatar("36e57693959447f78450899557b63da1", "userAvatar/123.png");
    }

    @Test
    public void testUpdatePassword() {
        userDao.updatePassword("36e57693959447f78450899557b63da1", "1234567890");
    }

    @Test
    public void testUpdateUserStatus() {
        userDao.updateUserStatus("36e57693959447f78450899557b63da1", 1);
    }

    @Test
    public void testUpdateUserRole() {
        userDao.updateUserRole("36e57693959447f78450899557b63da1", "a");
    }

    @Test
    public void testFindUserById() {
        System.out.println(userDao.findUserById("36e57693959447f78450899557b63da1"));
    }

    @Test
    public void testFindAllUsers() {
        List<User> users = userDao.findAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindUserByUserNameAndPassword() {
        System.out.println(userDao.findUserByUsernameAndPassword("admin", "admin"));
    }

    @Test
    public void testFindUserNameNum(){
        System.out.println(userDao.findUserNameNum("testUser"));
    }


    @After
    public void destroy() {

    }
}
