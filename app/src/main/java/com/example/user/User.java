package com.example.user;
//import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String state;
    private String zip;
    private String city;
    private String address;
    private String email;

    public User(String username, String password,
                String state, String zip, String city, String address,
                String email){
        this.username = username;
        this.password = password;
        this.state = state;
        this.zip = zip;
        this.city = city;
        this.address = address;
        this.email = email;

    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public String getState(){
        return state;
    }

    public String getZip(){
        return zip;
    }

    public String getCity(){
        return city;
    }

    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }

}