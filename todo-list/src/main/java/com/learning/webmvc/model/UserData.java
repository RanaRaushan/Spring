package com.learning.webmvc.model;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserData {


    private final List<User> users = new ArrayList<>();

//    constructor
    public UserData(){

//        add some dummy data, using addItem method so it  sets the  id field
        addUser(new User(0,"admin", "admin"));
        addUser(new User(1,"Rana", "1234"));
        addUser(new User(2,"Shalini", "1234"));
        addUser(new User(3,"SR", "123"));
        addUser(new User(4,"RS", "123"));
    }

//    public methods
    public List<User> getUsers(){
        return Collections.unmodifiableList(users);
    }

    public void addUser(@NonNull User toAdd){
        users.add(toAdd);
    }

    public User getUser(Integer id){
        for(User user: users){
            if(user.getUserID().equals(id)){
                return user;
            }
        }
        return null;
    }

    public boolean checkValidUser(Integer id, String password){
        User user = getUser(id);
        if (user == null){
            System.out.println("Invalid User ID, Do you want to create?");
            return false;
        }
        if (user.getPassword().equals(password)){
            System.out.println("Login Successfully!");
            return true;
        }
        else {
            System.out.println("Invalid Password");
            return false;
        }
    }

    public boolean findUser(@NonNull int id) {
        System.out.println("findUser called from UserData class"+ id);
        for(User user: users){
            if(user.getUserID().equals(id)){
                return true;
            }
        }
        return false;
    }
}
