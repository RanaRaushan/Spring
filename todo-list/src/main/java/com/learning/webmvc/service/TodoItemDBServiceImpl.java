/*
package com.learning.webmvc.service;

import com.learning.webmvc.DAO.TodoDao;
import com.learning.webmvc.model.TodoItemDB;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TodoItemDBServiceImpl implements TodoItemDBService{

    @Autowired
    @Getter
    private final TodoDao todoDao = new TodoDao();

    @Override
    @Transactional(readOnly = true)
    public List<TodoItemDB> todoList() {
        return todoDao.getTodosList();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Modifying
    public void todoUpdate(TodoItemDB toUpdate) {
        todoDao.updateTodosList(toUpdate);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Modifying
    public void todoDelete(int id) {
        todoDao.deleteTodosList(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Modifying
    public void todoAdd(TodoItemDB toAdd) {
        todoDao.addTodosList(toAdd);
    }
}
*/
