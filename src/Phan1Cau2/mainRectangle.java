package Phan1Cau2;

import java.util.Scanner;

public class mainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        Rectangle r = new Rectangle(width, height);
        System.out.println(r.toString());
    }
}

