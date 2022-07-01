package com.company.service;

import com.company.model.User;

public interface UserService {
    void userAdd(User user);
    void idFind(int id);
    void idDelete(int id);
    void allUsers();
}
