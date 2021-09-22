package com.company;

public class Krug {
    private double radius;

    public Krug(double r){
        radius = r;
    }
    public Krug(){
        radius = -1;
    }
    double getSquare(){
        return radius * radius * 3.14;
    }
    double getPerimeter(){
        return 2 * 3.14 * radius;
    }
    String getInfo(){
        return "Это круг с радиусом " + radius;
    }
    public static void main(String[] args){
        Krug krug = new Krug(10);
        System.out.println(krug.getSquare());
        System.out.println(krug.getPerimeter());
        System.out.println(krug.getInfo());
        krug.radius = 11;
        System.out.println(krug.getSquare());
        System.out.println(krug.getPerimeter());
        System.out.println(krug.getInfo());
    }
}
