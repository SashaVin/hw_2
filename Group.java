package edu.javacourse.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Group {
    ArrayList<Student> list = new ArrayList<>();
    String groupNumber;

    public void addStudent(Student newStudent){
        list.add(newStudent);
    }

    public void deleteStudent(Student student){
        list.remove(student);
    }
    public ArrayList<Student> getAll(){
        return list;
    }

    public Map<Integer, Integer> getCountByAge(){
        Map<Integer, Integer> states = new HashMap<Integer, Integer>();
        for(Student i: list){
            int age = i.getAge();
            if (states.containsKey(age)){
                int number = states.get(age);
                states.replace(age, number+=1);
            }else{
                states.put(age, 1);
            }
        }
        return states;
    }

    public Student getByNumber(int serialNumber) {
        Student x = new Student(0, "", "", 0, 0);
        for (Student i: list){
            int i1 = i.getNumber();
            if (i1 == serialNumber){
                x = i;
            }
        }
        return x;
    }

    public ArrayList<Student> getByMinScore(double score){
        ArrayList<Student> list2 = new ArrayList<>();
        for(Student i: list){
            double ball = i.getScore();
            if (ball >= score){
                list2.add(i);
            }
        }
        return list2;
    }

    public void printInfo(){
        for (Student i: list){
            System.out.println(i.getLastName() + " " + i.getName());
            System.out.println("Возраст: " + i.getAge());
            System.out.println("Номер зачетной книжки: " + i.getNumber());
            System.out.println("Номер группы: " + this.groupNumber);
            System.out.println("Средний балл: " + i.getScore());
            System.out.println();
        }
    }

    public class Student {
        private String name;
        private int number;
        private String lastName;
        private int age;
        private double averageScore;
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
    }
    public void main(String[] args) {
        Student student = new Student(1488, "KIrik", "Popik", 21, 3.6);
        Student student2 = new Student(1489, "Alex", "Vinni", 19, 4.0);
        Student student3 = new Student(1490, "Kostya", "Kvarc", 20, 4.1);
        Student student4 = new Student(1491, "Vovka", "Silki", 19, 3.8);
        Group group = new Group();
        Group group2 = new Group();
        group.addStudent(student);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.getByNumber(1488);
        group.deleteStudent(student);
        group.addStudent(student);
        System.out.println(group2.getAll());
        group.printInfo();
        group2.printInfo();
        System.out.println(group2.getByMinScore(3.9));
        System.out.println(group.getCountByAge());
    }
}
