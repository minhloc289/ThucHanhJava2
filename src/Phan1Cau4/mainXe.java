package Phan1Cau4;
import java.util.Scanner;
import java.util.ArrayList;

public class mainXe {
    public static void main(String[] args) {
        ArrayList<Xe> xeList = Xe.inputXe();
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách xe vừa nhập: ");
        System.out.println("--------------------------");
        Xe.xuatDS(xeList);
        System.out.println("--------------------------");
        System.out.println("Nhập tên chủ xe: ");
        String tenChuXe = sc.nextLine();
        System.out.println("Nhập loại xe: ");
        String loaiXe = sc.nextLine();
        Xe.ThueXe(xeList, tenChuXe, loaiXe);
    }
}
