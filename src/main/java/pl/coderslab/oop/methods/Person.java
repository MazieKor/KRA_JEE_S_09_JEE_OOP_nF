package pl.coderslab.oop.methods;

public class Person {
    String name;
    private String surname;
    private int age;
    private char gender;

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFullName(){
        return this.name + " " + this.  surname;
    }

    public void incrAge() {
        this.age = this.age + 1;
    }



}
