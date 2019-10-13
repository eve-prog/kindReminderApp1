package com.team.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class NewTask {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String task;
    private Date time;

    public NewTask(int id, String task, Date time) {
        this.id = id;
        this.task = task;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
