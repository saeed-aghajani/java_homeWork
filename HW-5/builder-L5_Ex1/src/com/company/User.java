package com.company;

public class User {
    public String userName;
    public String realName;
    public String pass;
    public String Address;
    public String telephon;
    public String education;
    public  int age;


    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return  this;
    }

    public String getRealName() {
        return realName;
    }

    public User setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public User setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getAddress() {
        return Address;
    }

    public User setAddress(String address) {
        Address = address;
        return  this;
    }

    public String getTelephon() {
        return telephon;
    }

    public User setTelephon(String telephon) {
        this.telephon = telephon;
        return  this;
    }

    public String getEducation() {
        return education;
    }

    public User setEducation(String education) {
        this.education = education;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }
}
