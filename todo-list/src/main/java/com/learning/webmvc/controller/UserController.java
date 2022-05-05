package com.learning.webmvc.controller;

import com.learning.webmvc.model.User;
import com.learning.webmvc.model.UserData;
import com.learning.webmvc.service.UserService;
import com.learning.webmvc.utils.AttributeName;
import com.learning.webmvc.utils.Mappings;
import com.learning.webmvc.utils.ViewName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class UserController {

    //    fields
    private final UserService userService;


    //    constructor
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //    model attribute
    @ModelAttribute
    public UserData userData() {
        System.out.println("userData() called"+ userService.getUserData().getUsers());
        return userService.getUserData();
    }

    //    handler methods
//    http://localhost:9080/todo-list/home
    @GetMapping(Mappings.HOME)
    public String home(@RequestParam(required = false) int id, Model model) {
        String userName = userService.getUser(id).getUserName();
        log.info("user id = {}", id);
        log.info("user Name = {}", userName);
        model.addAttribute(AttributeName.USER_NAME, userName);
        return ViewName.HOME;
    }

    //    http://localhost:9080/todo-list/sign-in
    @GetMapping(Mappings.LOGIN)
    public String userLogin(@RequestParam(defaultValue = "") String error, Model model) {
        User user = new User(null,"","");
        log.info("User lists at index 0 = {}", user);
        log.info("string message = {} ", error);
        model.addAttribute(AttributeName.USER, user);
        model.addAttribute("error", error);
        return ViewName.LOGIN;
    }

    @PostMapping(Mappings.LOGIN)
    public String processLogin(@ModelAttribute(AttributeName.USER) User user, Model model) {
        log.info("user form from = {}", user);
        String error = "Invalid User or Password";
        System.out.println("processLogin() Called " + user.getUserID() + user.getPassword());
        if (userService.checkValidUser(user.getUserID(), user.getPassword())){
            error = "";
            model.addAttribute("id", user.getUserID());
            return "redirect:/" + Mappings.HOME;
        }else if (user.getUserID() == null){
            error = "Field can't be blank";
            model.addAttribute("error", error);
            return "redirect:/" + Mappings.LOGIN;
        }
        model.addAttribute("error", error);
        return "redirect:/" + Mappings.LOGIN;
    }

//    http://localhost:9080/todo-list/sign-in
    @GetMapping(Mappings.REGISTER)
    public String userRegister(@RequestParam(defaultValue = "") String error, Model model) {
        User user = new User(null,"","");
        log.info("UserRegister called() = {}", user);
        model.addAttribute(AttributeName.USER, user);
        model.addAttribute("error", error);
        return ViewName.REGISTER;
    }

    @PostMapping(Mappings.REGISTER)
    public String processRegister(@ModelAttribute(AttributeName.USER) User user, Model model) {
        log.info("processRegister called() user form from = {}", user);
        String error = "";
        if (user.getUserID() == null){
            error = "Field can't be blank";
            model.addAttribute("error",error);
            return "redirect:/" + Mappings.REGISTER;
        }
        if(userService.findUser(user.getUserID())){
            error = "User already created with userID= " + user.getUserID() + "";
            model.addAttribute("error",error);
            return "redirect:/" + Mappings.REGISTER;
        }

        userService.addUser(user);
        return "redirect:/" + Mappings.LOGIN;
    }

}
