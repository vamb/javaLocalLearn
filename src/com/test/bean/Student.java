package com.test.bean;

public class Student {
    private String name;
    private Integer age;
    private String address;

    public Student(){}

    public Student (String name){
        this.name = name;
    }

    public Student(String name, Integer age){
        this.name  = name;
        this.age = age;
    }

    public Student (String name, Integer age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        String str = "Student name: "+this.getName()+" age: "+this.getAge()
                +" address: "+this.getAddress();
        return str;
    }
}
