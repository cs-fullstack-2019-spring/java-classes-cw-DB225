package com.company.classwork;

public class Dog {
    private String name;
    private String bred;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBred() {
        return bred;
    }

    public void setBred(String bred) {
        this.bred = bred;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDetails(){
        System.out.println("Howdy , my name is "+this.name+".");
        System.out.println("I'm a "+this.color+" "+this.bred+" "+this.age+" yrs old in Human years.");
    }
}
