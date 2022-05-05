package com.learning.webmvc.service;

import com.learning.webmvc.model.User;
import com.learning.webmvc.model.UserData;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Getter
    private final UserData userData = new UserData();

    @Override
    public boolean checkValidUser(Integer id, String pass) {
        return userData.checkValidUser(id, pass);
    }

    @Override
    public User getUser(int id) {
        return userData.getUser(id);
    }

    @Override
    public void addUser(User toAdd) {
        userData.addUser(toAdd);
    }

    @Override
    public boolean findUser(int id) {
        return userData.findUser(id);
    }
}
