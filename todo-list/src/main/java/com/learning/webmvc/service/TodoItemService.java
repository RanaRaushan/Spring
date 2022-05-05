package com.learning.webmvc.service;

import com.learning.webmvc.model.TodoData;
import com.learning.webmvc.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();
}
