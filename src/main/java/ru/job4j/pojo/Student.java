package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String name;
    private int noGroup;
    private String dateEntrance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoGroup() {
        return noGroup;
    }

    public void setNoGroup(int noGroup) {
        this.noGroup = noGroup;
    }

    public String getDateEntrance() {
        return dateEntrance;
    }

    public void setDateEntrance(String dateEntrance) {
        this.dateEntrance = dateEntrance;
    }
}