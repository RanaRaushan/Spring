/*
package com.learning.webmvc.DAO;

import com.learning.webmvc.model.TodoItemDB;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoDao {
    @PersistenceContext
    private EntityManager em;

    private final List<TodoItemDB> items = new ArrayList<>();

    public List<TodoItemDB> getTodosList() {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<TodoItemDB> criteriaQuery = cb.createQuery(TodoItemDB.class);
        @SuppressWarnings("unused")
        Root<TodoItemDB> root = criteriaQuery.from(TodoItemDB.class);
        return em.createQuery(criteriaQuery).getResultList();
    }

    public void updateTodosList(TodoItemDB itemDB) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Todo> criteriaQuery = cb.createQuery(Todo.class);

        @SuppressWarnings("unused")
//		Root<Todo> root = criteriaQuery.from(Todo.class);

        */
/*
         * change from here to get different query
         *//*

                CriteriaUpdate<TodoItemDB> update = cb.createCriteriaUpdate(TodoItemDB.class);
        Root<TodoItemDB> root = update.from(TodoItemDB.class);

//        update.set("description", newDesc);
//        update.set("taskIsDone", isTaskDone);
//        update.where(cb.equal(root.get("id"), id));
//		criteriaQuery.select(root2);

        em.createQuery(update).executeUpdate();
    }

    public void deleteTodosList(int id) {
        // TODO Auto-generated method stub

        CriteriaBuilder cb = em.getCriteriaBuilder();

        @SuppressWarnings("unused")
//		Root<Todo> root = criteriaQuery.from(Todo.class);

        */
/*
         * change from here to get different query
         *//*

                CriteriaDelete<TodoItemDB> delete = cb.createCriteriaDelete(TodoItemDB.class);
        Root<TodoItemDB> root = delete.from(TodoItemDB.class);

        delete.where(cb.equal(root.get("id"), id));
//		criteriaQuery.select(root2);

        em.createQuery(delete).executeUpdate();

    }

    public void addTodosList(TodoItemDB itemDB) {
        // TODO Auto-generated method stub



    }

}
*/
