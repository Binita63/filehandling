/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.binita.filehandling.entity;

/**
 *
 * @author Bini
 */
public class Student {
    private int id;
    private String name;
    private String address;
    private int level;
    private boolean status;

    public Student() {
    }

    public Student(int id, String name, String address, int level, boolean status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.level = level;
        this.status = status;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
