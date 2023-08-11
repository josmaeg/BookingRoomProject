package com.springDemoPackage.springDemo.model;

public class Room {
    private int id;
    private String name;
    private String type;
    private String availability;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Room(int id, String name, String type, String availability) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
