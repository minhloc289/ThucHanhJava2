package Phan2Cau4;

public class Motobike extends Vehicle {
    @Override
    public void move(double km){
        double fuelNeed = 2 * km / 100 + 0.1 * this.loads / 10;
        if (fuelNeed > this.fuel){
            System.out.println("Xe khong du nhien lieu de di duoc quang duong nay");
        }
        else {
            this.fuel -= fuelNeed;
            System.out.println("Xe di duoc " + km + " km");
        }
    }
}
