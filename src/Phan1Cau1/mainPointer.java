package Phan1Cau1;

public class mainPointer {
    public static void main(String[] args) {
        Pointer p1 = new Pointer();
        Pointer p2 = new Pointer();
        System.out.println("Enter coordinates of p1: ");
        p1.input();
        System.out.println("Enter coordinates of p2: ");
        p2.input();
        System.out.println("Coordinates of p1: ");
        p1.output();
        System.out.println("Coordinates of p2: ");
        p2.output();
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
    }
}

