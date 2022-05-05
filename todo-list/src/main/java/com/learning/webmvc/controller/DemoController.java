package com.learning.webmvc.controller;

import com.learning.webmvc.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

//    fields
    private final DemoService demoService;

//    constructor
    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

//    request methods
    //    http://localhost:8090/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

//    http://localhost:8090/todo-list/welcome
//    http://localhost:8090/todo-list/welcome?user=Rana
    @GetMapping("/welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model){
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);
        log.info("Model = {}",model);
        return "welcome";
    }

//    Model Attributes
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        log.info("Welcome message called");
        return demoService.getWelcomeMessage();
    }


}
