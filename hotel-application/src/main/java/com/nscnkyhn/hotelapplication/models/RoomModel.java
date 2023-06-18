package com.nscnkyhn.hotelapplication.models;

public class RoomModel {
    private int ID;
    private String name;
    private String status;
    public RoomModel() {
    }

    public RoomModel(int ID, String name, String status) {
        this.ID = ID;
        this.name = name;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
