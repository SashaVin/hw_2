package com.company;

public class Main {
    
    public static void main(String[] args){
        Krug krug = new Krug(10);
        System.out.println(krug.getSquare());
        System.out.println(krug.getPerimeter());
        System.out.println(krug.getInfo());

        Kv kv = new Kv(6.2);
        System.out.println(kv.getSquare());
        System.out.println(kv.getPerimeter());
        System.out.println(kv.getInfo());

        Pr pr = new Pr(5, 10);
        System.out.println(pr.getSquare());
        System.out.println(pr.getPerimeter());
        System.out.println(pr.getInfo());
    }
}
