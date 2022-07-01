package com.company.model;

public class User {
    private int id;
    private String name;
    private Gender gender;

    public User(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public User() {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\n----------User---------" +
                "\nid: " + id +
                "\nname: " + name +
                "\ngender: " + gender ;
    }
}
