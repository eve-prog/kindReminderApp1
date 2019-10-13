package com.team.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Utilities {

    // EON,
    //  ENEL,
    //  WATER,
    //  ORANGE,
    //  RDS,
    //registry index, paybill

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String utility_name;
    private String action;
    private Date time;

    public Utilities(int id, String utility_name, String action, Date time) {
        this.id = id;
        this.utility_name = utility_name;
        this.action = action;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUtility_name() {
        return utility_name;
    }

    public void setUtility_name(String utility_name) {
        this.utility_name = utility_name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}


