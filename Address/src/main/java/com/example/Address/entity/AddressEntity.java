package com.example.Address.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class AddressEntity {




    @Column(name = "lane1")
    private String lane1;


    @Column(name = "emplo_id")
    private int employee_id;

    @Column(name = "lane2")
    private String lane2;
    @Column(name = "lane3")
    private String lane3;

    public String getZip() {
        return zip;
    }

    public String getLane3() {
        return lane3;
    }

    public void setLane3(String lane3) {
        this.lane3 = lane3;
    }

    public String getLane2() {
        return lane2;
    }

    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLane1() {
        return lane1;
    }

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "zip")
    private String zip;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


}

