package com.cognizant.springlearn.model;

public class Department {
    private int id;
    private String name;

    // Default constructor
    public Department() {}

    // Constructor with parameters
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters
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

    // toString()
    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}
