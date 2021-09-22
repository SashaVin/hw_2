package com.company;

public class Pr {
    private double st1;
    private double st2;

    public Pr(double a, double b){
        st1 = a;
        st2 = b;
    }
    public Pr(){
        st1 = -1;
        st2 = -1;
    }
    double getSquare(){
        return st1 * st2;
    }
    double getPerimeter(){
        return 2 * (st1 + st2);
    }
    String getInfo(){
        return "Это прямоугольник со сторонами " + st1 + " и " + st2;
    }
    public static void main(String[] args){
        Pr pr = new Pr(5, 10);
        System.out.println(pr.getSquare());
        System.out.println(pr.getPerimeter());
        System.out.println(pr.getInfo());
        pr.st1 = 6;
        System.out.println(pr.getSquare());
        System.out.println(pr.getPerimeter());
        System.out.println(pr.getInfo());
    }
}
