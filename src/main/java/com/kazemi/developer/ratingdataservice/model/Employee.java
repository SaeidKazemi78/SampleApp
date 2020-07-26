package com.kazemi.developer.ratingdataservice.model;

import lombok.Data;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Date startDt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }
}
