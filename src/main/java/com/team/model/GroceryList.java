package com.team.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class GroceryList {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String grocery;
    private Date time;

    public GroceryList(int id, String grocery, Date time) {
        this.id = id;
        this.grocery = grocery;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrocery() {
        return grocery;
    }

    public void setGrocery(String grocery) {
        this.grocery = grocery;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
