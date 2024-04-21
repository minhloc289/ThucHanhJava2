package Phan2Cau4;

public abstract class Vehicle {
    protected double fuel;
    protected double loads;

    public void addLoads(double loads) {
        this.loads += loads;
    }

    public void realeaseLoads(double loads) {
        if (this.loads - loads < 0){
            System.out.println("Khong the bot hang");
        }
        else {
            this.loads -= loads;
        }
    }

    public void refuel(double fuel) {
        this.fuel += fuel;
    }

    public abstract void move(double km);

    public boolean outOfFuel() {
        return fuel == 0;
    }

    public double remainingFuel() {
        return this.fuel;
    }

}
