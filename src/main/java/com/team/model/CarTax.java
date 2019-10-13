package com.team.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class CarTax {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tax_name;
    private Date time;

    //INSURANCE,
   // ITP,
   // IMPOSIT,


    public CarTax(int id, String tax_name, Date time) {
        this.id = id;
        this.tax_name = tax_name;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTax_name() {
        return tax_name;
    }

    public void setTax_name(String tax_name) {
        this.tax_name = tax_name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
