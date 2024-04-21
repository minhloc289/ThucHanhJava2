package Phan1Cau4;
import java.util.Scanner;
import java.util.ArrayList;
public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private double triGiaXe;
    private float dungTich;
    public Xe() {};
    public Xe(String tenChuXe, String loaiXe, double triGiaXe, float dungTich) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.triGiaXe = triGiaXe;
        this.dungTich = dungTich;
    }
//    public static Xe[] inputXe() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Nhập số lượng xe: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        Xe[] xeArr = new Xe[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập thông tin xe thứ " + (i + 1) + ":");
//            System.out.print("Nhập tên chủ xe: ");
//            String tenChuXe = sc.nextLine();
//
//            System.out.print("Nhập loại xe: ");
//            String loaiXe = sc.nextLine();
//
//            System.out.print("Nhập trị giá xe: ");
//            double triGiaXe = sc.nextDouble();
//
//            System.out.print("Nhập dung tích: ");
//            float dungTich = sc.nextFloat();
//            sc.nextLine();
//
//            xeArr[i] = new Xe(tenChuXe, loaiXe, triGiaXe, dungTich);
//        }
//
//        return xeArr;
//    } //tao mang de nhap so luong Xe ( cach khac )
    public static ArrayList<Xe> inputXe(){
        ArrayList<Xe> xeList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập thông tin xe: ");
            System.out.print("Nhập tên chủ xe: ");
            String tenChuXe = sc.nextLine();
            if (tenChuXe.isEmpty()){
                break;
            }
            System.out.print("Nhập loại xe: ");
            String loaiXe = sc.nextLine();
            System.out.print("Nhập trị giá xe: ");
            double triGiaXe = sc.nextDouble();
            System.out.print("Nhập dung tích: ");
            float dungTich = sc.nextFloat();
            sc.nextLine();
            xeList.add(new Xe(tenChuXe, loaiXe, triGiaXe, dungTich));
        }
        return xeList;
    }
    public double tinhThue(){
        if (dungTich < 100){
            return triGiaXe * 0.01;
        }
        else if (dungTich >= 100 && dungTich <= 175){
            return triGiaXe * 0.03;
        }
        else {
            return triGiaXe * 0.05;
        }
    }
    public void xuat(){
        System.out.println("Tên chủ xe: " + tenChuXe);
        System.out.println("Loại xe: " + loaiXe);
        System.out.println("Trị giá xe: " + triGiaXe);
        System.out.println("Dung tích: " + dungTich);
        System.out.println("Thuế phải nộp: " + tinhThue());
    }
    public static void xuatDS(ArrayList<Xe> xeList){
        for (Xe xe : xeList){
            xe.xuat();
            System.out.println("--------------------------");
        }
    }
    public static void ThueXe(ArrayList<Xe> xeList, String tenChuXe, String loaiXe){
        boolean flag = false;
        for (Xe xe : xeList){
            if (xe.tenChuXe.equals(tenChuXe) && xe.loaiXe.equals(loaiXe)){
                System.out.println("Tên chủ xe: " + xe.tenChuXe);
                System.out.println("Thuế phải nộp: " + xe.tinhThue());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy xe cần tìm!");
        }
    }
}

