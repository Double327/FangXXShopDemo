package cn.doublefloat.fangxxshop.service;

import cn.doublefloat.fangxxshop.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/12 7:48 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserService {

    @Autowired
    private IUserService userService = null;


    @Test
    public void register() {
        User user = new User();
        user.setName("testService");
        user.setPassword("testService");
        user.setPhoneNum("12345678900");
        userService.register(user);
    }


    @Test
    public void findUser() {

    }


    @Test
    public void isExist() {

    }


    @Test
    public void updateAvatar() {

    }


    @Test
    public void updateMoney() {
    }


    @Test
    public void getAllUsers() {

    }


    @Test
    public void deleteUserById() {

    }


    @Test
    public void getUserById() {

    }


    @Test
    public void updateStatus() {

    }


}
