package com.team.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class ShutOff {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  private int id;
    // private String electronics;
    // private String water;
    // private String window;
    //  private String door;
    //  private Date time;

    private int id;
    private String utility;
    private Date time;

    public ShutOff(int id, String utility, Date time) {
        this.id = id;
        this.utility = utility;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUtility() {
        return utility;
    }

    public void setUtility(String utility) {
        this.utility = utility;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
