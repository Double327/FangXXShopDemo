package cn.doublefloat.fangxxshop.service.impl;

import cn.doublefloat.fangxxshop.dao.IUserDao;
import cn.doublefloat.fangxxshop.entity.User;
import cn.doublefloat.fangxxshop.service.IUserService;
import cn.doublefloat.fangxxshop.utils.XXShopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/12 5:31 下午
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    @Qualifier(value = "userDao")
    private IUserDao userDao = null;

    @Override
    public void register(User user) {
        user.setId(XXShopUtils.getId());
        user.setRegTime(XXShopUtils.getTime());
        user.setMoney(0.0);
        user.setRole("u");
        userDao.addUser(user);
    }

    @Override
    public User findUser(String username, String password) {
        return userDao.findUserByUsernameAndPassword(username, password);
    }

    @Override
    public boolean isExist(String username) {
        Integer count = userDao.findUserNameNum(username);
        return count > 0;
    }

    @Override
    public void updateAvatar(String id, String avatar) {
        userDao.updateAvatar(id, avatar);
    }

    @Override
    public void updateMoney(String id, Double money) {
        userDao.updateUserMoney(id, money);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public void deleteUserById(String id) {
        userDao.deleteUserById(id);
    }

    @Override
    public User getUserById(String id) {
        return userDao.findUserById(id);
    }

    @Override
    public void updateStatus(String id, Integer status) {
        userDao.updateUserStatus(id, status);
    }
}
