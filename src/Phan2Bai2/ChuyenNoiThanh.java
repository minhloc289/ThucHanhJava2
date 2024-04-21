package Phan2Bai2;

import java.util.Scanner;
public class ChuyenNoiThanh implements VanTai{
    private int maTuyen;
    private String hoTenTaiXe;
    private String soXe;
    private int khoiLuong;
    private double doanhThu;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin chuyến nội thành: ");
        System.out.print("Nhập mã tuyến: ");
        maTuyen = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập họ tên tài xế: ");
        hoTenTaiXe = sc.nextLine();
        System.out.println("Nhập số xe: ");
        soXe = sc.nextLine();
        System.out.println("Nhập khối lượng: ");
        khoiLuong = sc.nextInt();
        System.out.println("Nhập doanh thu: ");
        doanhThu = sc.nextDouble();
    }
    public void output(){
        System.out.println("Thông tin chuyến nội thành: ");
        System.out.println("Mã tuyến: " + maTuyen);
        System.out.println("Họ tên tài xế: " + hoTenTaiXe);
        System.out.println("Số xe: " + soXe);
        System.out.println("Khối lượng: " + khoiLuong);
        System.out.println("Doanh thu: " + doanhThu);
    }
    public double getDoanhThu(){
        return doanhThu;
    }


}
