package com.team.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Event {
    //    private String party;
//    private String course;
//    private String sport;
//    private String appointment;
    //ENUM
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String event_name;
    private String description;
    private Date time;


    public Event(int id, String event_name, String description, Date time) {
        this.id = id;
        this.event_name = event_name;
        this.description = description;
        this.time = time;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}



