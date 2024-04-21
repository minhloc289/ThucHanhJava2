package Phan2Bai1;
import java.util.Scanner;
public class Employee extends Person {
    private float salary;
    public Employee(){};
    public float getSalary(){
        return salary;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lương nhân viên: ");
        salary = sc.nextFloat();
    }
    public void show(){
        System.out.println("Tên nhân viên: " + getName());
        System.out.println("Tuổi nhân viên: " + getAge());
        System.out.println("Lương: " + getSalary());
    }
    public float addSalary(){
        return salary += salary * 0.1;
    }
    public float addSalary(float x){
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        return salary += salary * (x / 100);
    }
}
