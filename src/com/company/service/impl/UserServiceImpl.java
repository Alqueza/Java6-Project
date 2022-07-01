package com.company.service.impl;

import com.company.MyException;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao(){

    };
    @Override
    public void userAdd(User user) {
        userDao.userAdd(user);
    }

    @Override
    public void idFind(int id) {
        boolean yesOrNo = userDao.yesOrno(id);

        if (!yesOrNo) {
            try {
                throw new MyException("Пользователь с таким Id не найден: " + id);
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }

        User user = userDao.find(id);

        System.out.println(user);
    }


    @Override
    public void idDelete(int id) {
        boolean delete = userDao.yesOrno(id);
        if (!delete) {
            try {
                throw new MyException("Ne smojete udalit' user: id = " + id + " netu");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }

        userDao.delete(id);
    }

    @Override
    public void allUsers() {
        List<User> userList = userDao.getUsers();
        userList.forEach(System.out::println);
    }
}
