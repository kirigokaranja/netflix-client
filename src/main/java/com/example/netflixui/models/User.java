package com.example.netflixui.models;

public class User {
    private Long Id;
    private String userName;
    private int userNationalId;
    private UserType userType;

    public User(){

    }
    public User( int userNationalId) {
        this.userNationalId = userNationalId;
    }
    public User(String userName, int userNationalId) {
        this.userName = userName;
        this.userNationalId = userNationalId;
    }

    public User(String userName, int userNationalId, UserType userType) {
        this.userName = userName;
        this.userNationalId = userNationalId;
        this.userType = userType;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getuserNationalId() {
        return userNationalId;
    }

    public void setuserNationalId(int userNationalId) {
        this.userNationalId = userNationalId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", userNationalId=" + userNationalId +
                ", userType=" + userType +
                '}';
    }
}
