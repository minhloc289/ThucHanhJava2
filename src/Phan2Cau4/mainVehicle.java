package Phan2Cau4;
import java.util.Scanner;
public class mainVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motobike motobike = new Motobike();
        motobike.refuel(100);
        motobike.addLoads(50);
        motobike.move(30);
        motobike.realeaseLoads(20);
        motobike.move(20);
        System.out.println("Nhien lieu con lai cua xe may la: " + motobike.remainingFuel() + "lit");
        Truck truck = new Truck();
        truck.refuel(300);
        truck.addLoads(500);
        truck.move(50);
        truck.realeaseLoads(200);
        truck.move(100);
        System.out.println("Nhien lieu con lai cua xe tai la: " + truck.remainingFuel() + "lit");
    }
}
