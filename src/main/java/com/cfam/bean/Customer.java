package com.cfam.bean;

public class Customer {

    private String name;

    private boolean dType;

    private Integer tripartiteType;

    public Customer() {
    }

    public Customer(String name, boolean dType, Integer tripartiteType) {
        this.name = name;
        this.dType = dType;
        this.tripartiteType = tripartiteType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isdType() {
        return dType;
    }

    public void setdType(boolean dType) {
        this.dType = dType;
    }

    public Integer getTripartiteType() {
        return tripartiteType;
    }

    public void setTripartiteType(Integer tripartiteType) {
        this.tripartiteType = tripartiteType;
    }
}
