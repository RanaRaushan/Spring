package com.learning.webmvc.service;

import com.learning.webmvc.model.User;
import com.learning.webmvc.model.UserData;

public interface UserService {

    boolean checkValidUser(Integer id, String pass);
    User getUser(int id);
    UserData getUserData();
    void addUser(User toAdd);
    boolean findUser(int id);
}
