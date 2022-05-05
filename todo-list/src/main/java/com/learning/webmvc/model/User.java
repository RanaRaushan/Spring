package com.learning.webmvc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"userID"})
public class User {

//    fields
    private Integer userID;
    private String userName;
    private String password;

//    constructor
    public User(Integer userID, String userName, String password) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
    }

}
