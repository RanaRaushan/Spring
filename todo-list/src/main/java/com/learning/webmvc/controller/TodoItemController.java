package com.learning.webmvc.controller;

import com.learning.webmvc.model.TodoData;
import com.learning.webmvc.model.TodoItem;
import com.learning.webmvc.service.TodoItemService;
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

import java.time.LocalDate;

@Slf4j
@Controller
public class TodoItemController {

//    fields
    private final TodoItemService todoItemService;



    //    constructor
    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }
//    model attribute
    @ModelAttribute
    public TodoData todoData(){
        System.out.println(todoItemService.getData().getItems());
        return todoItemService.getData();
    }

//    handler methods
//    http://localhost:9080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewName.ITEMS_LIST;
    }

    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(@RequestParam(required = false, defaultValue = "-1") int id, Model model){
        log.info("editing id = {}",id);
        String type = "Edit";
        TodoItem todoItem = todoItemService.getItem(id);
        if (todoItem == null){
            todoItem = new TodoItem("","", LocalDate.now());
            type = "Add";
        }
        model.addAttribute(AttributeName.TODO_ITEM, todoItem);
        model.addAttribute("type", type);
        return ViewName.ADD_ITEM;
    }

    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeName.TODO_ITEM)  TodoItem todoItem){
        log.info("todoItem form from = {}", todoItem);
        if(todoItem.getId() == 0){
            todoItemService.addItem(todoItem);
        }
        else {
            todoItemService.updateItem(todoItem);
        }

        return "redirect:/" + Mappings.ITEMS;
    }

    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteItem(@RequestParam("id") int id){
        log.info("deleting item with id={}", id);
        todoItemService.removeItem(id);
        return "redirect:/" + Mappings.ITEMS;
    }

    @GetMapping(Mappings.VIEW_ITEM)
    public String viewItem(@RequestParam("id") int id, Model model){
        log.info("View item with id={}", id);
        model.addAttribute(AttributeName.TODO_ITEM, todoItemService.getItem(id));
        return ViewName.VIEW_ITEM;
    }
}
