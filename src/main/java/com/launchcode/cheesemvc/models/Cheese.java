package com.launchcode.cheesemvc.models;

public class Cheese {

    private int id;
    private String name;
    private String description;

    private static int nextId = 1;

    public Cheese(String name, String description) {
        this();
        this.setName(name);
        this.setDescription(description);
    }

    public Cheese() {
        setId(nextId);
        nextId++;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
