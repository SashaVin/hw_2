package com.company;

public class Kv {
    private double st;

    public Kv(double a){
        st = a;
    }
    public Kv(){
        st = -1;
    }
    double getSquare(){
        return st * st;
    }
    double getPerimeter(){
        return 4 * st;
    }
    String getInfo(){
        return "Это квадрат со сторой " + st;
    }
    public static void main(String[] args){
        Kv kv = new Kv(6.2);
        System.out.println(kv.getSquare());
        System.out.println(kv.getPerimeter());
        System.out.println(kv.getInfo());
        kv.st = 7;
        System.out.println(kv.getSquare());
        System.out.println(kv.getPerimeter());
        System.out.println(kv.getInfo());
    }
}
