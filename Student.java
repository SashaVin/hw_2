package com.company;

public class Student {
    private String name;
    private int number;
    private String lastName;
    private int age;
    private double averageScore;

    public Student(int n, String nam, String lName, int a, double aScore){
        this.number = n;
        this.name = nam;
        this.lastName = lName;
        this.age = a;
        this.averageScore = aScore;
    }
    public void printInfo(Student student){
        System.out.println("Номер зачетной книжки: " + student.number);
        System.out.println("Имя студента: " + student.name);
        System.out.println("Фамилия студента: " + student.lastName);
        System.out.println("Возраст студента: " + student.age);
        System.out.println("Средний балл: " + student.averageScore);
    }

    @Override
    public String toString() {
        return lastName + " " + name + " " + age + " " + number + " " + averageScore;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public int getNumber(){
        return this.number;
    }

    public double getScore(){
        return this.averageScore;
    }

    public static void main(String[] args){
        Student student = new Student(11, "Саша", "В", 20, 4);
        student.printInfo(student);
    }

}
