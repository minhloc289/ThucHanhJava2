package Phan2Bai1;
import java.util.Scanner;
public class mainPerson {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin cho nhân viên: ");
        emp.input();
        System.out.println("-------------------------------");
        System.out.println("Thông tin của nhân viên: ");
        emp.show();
        System.out.println("Lương của nhân viên tăng mặc định: " + emp.addSalary());
        System.out.println("Nhập phần trăm lương muốn tăng: ");
        float x = sc.nextFloat();
        System.out.println("Lương của nhân viên tăng theo tham số: " + emp.addSalary(x));
    }
}
