package Phan2Cau4;

public class Truck extends Vehicle{
    @Override
    public void move(double km){
        double fuelNeed = 20 * km / 100 + 1 * this.loads / 100;
        if (fuelNeed > this.fuel){
            System.out.println("Xe khong du nhien lieu de di duoc quang duong nay");
        }
        else {
            this.fuel -= fuelNeed;
            System.out.println("Xe di duoc " + km + " km");
        }
    }
}
