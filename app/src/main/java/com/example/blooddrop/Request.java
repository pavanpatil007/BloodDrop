package com.example.blooddrop;

public class Request {
    String name;
    String bloodGroup;
    int quantity;
    String phoneNum;
    //    Use maps format "Latitude, Longitude"
    String time;
    String date;
    double lat;
    double lon;
    String userId;
    String key;

    public Request(String key, String name, String bloodGroup, int quantity, String phoneNum, String time, String date, double lat, double lon, String userId) {
        this.key = key;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.quantity = quantity;
        this.phoneNum = phoneNum;
        this.time = time;
        this.date = date;
        this.lat = lat;
        this.lon = lon;
        this.userId = userId;
    }

    public Request() {
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }
    public String getKey() {return key;}
}
