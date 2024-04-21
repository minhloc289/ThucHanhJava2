package Phan1Cau1;

import  java.util.Scanner;
public class Pointer {
    public double x;
    public double  y;
    public Pointer(){}; // default constructor
    public Pointer(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = sc.nextDouble();
        System.out.println("Enter y: ");
        y = sc.nextDouble();
    }
    public void output(){
        System.out.println("x: " + x + " y: " + y);
    }
    public double distance(Pointer p){
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}

