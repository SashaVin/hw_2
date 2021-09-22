package edu.javacourse.collection;

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

    public static void main(String[] args){
        Student student = new Student(11, "Саша", "В", 20, 4);
        student.printInfo(student);
    }
    
}

