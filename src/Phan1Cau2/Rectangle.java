package Phan1Cau2;

import  java.util.Scanner;
public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double DienTich(){
        return this.width * this.height;
    }
    public double ChuVi(){
        return (this.width + this.height) * 2;
    }
    public String toString(){
        return "Rectangle: width = " + this.width + ", height = " + this.height + ", Dien tich = " + DienTich() + ", Chu vi = " + ChuVi();
    }
}

