package com.tranduythanh.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Category implements Serializable {

    private int id;
    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @NonNull
    @Override
    public String toString() {
        String infor=id+"-"+name;
        return infor;
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
}
