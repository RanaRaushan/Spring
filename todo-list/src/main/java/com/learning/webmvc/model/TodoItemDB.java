/*
package com.learning.webmvc.model;

import lombok.Data;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

//@EqualsAndHashCode(of = {"id"})
@Data
@Service
@Entity
@Table(name = "todoIntellij")
public class TodoItemDB {

//    fields
    @Id
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "details")
    private String details;

    @Column(name = "deadLine")
    private LocalDate deadLine;

    @Column(name = "taskDone")
    private boolean taskDone;

//    constructor
    public TodoItemDB(String title, String details, LocalDate deadLine, boolean taskDone) {
        this.title = title;
        this.details = details;
        this.deadLine = deadLine;
        this.taskDone = taskDone;
    }

}
*/
