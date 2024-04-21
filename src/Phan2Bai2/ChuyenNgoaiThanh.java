package Phan2Bai2;
import java.util.Scanner;
public class ChuyenNgoaiThanh implements VanTai {
    private int maTuyen;
    private String hoTenTaiXe;
    private String soXe;
    private int khoiLuong;
    private String noiDen;
    private int soNgayVanChuyen;
    private double doanhThu;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin chuyến ngoại thành: ");
        System.out.print("Nhập mã tuyến: ");
        maTuyen = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập họ tên tài xế: ");
        hoTenTaiXe = sc.nextLine();
        System.out.println("Nhập số xe: ");
        soXe = sc.nextLine();
        System.out.println("Nhập khối lượng: ");
        khoiLuong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập nơi đến: ");
        noiDen = sc.nextLine();
        System.out.println("Nhập số ngày vận chuyển: ");
        soNgayVanChuyen = sc.nextInt();
        System.out.println("Nhập doanh thu: ");
        doanhThu = sc.nextDouble();
    }
    public void output(){
        System.out.println("Thông tin chuyến ngoại thành: ");
        System.out.println("Mã tuyến: " + maTuyen);
        System.out.println("Họ tên tài xế: " + hoTenTaiXe);
        System.out.println("Số xe: " + soXe);
        System.out.println("Khối lượng: " + khoiLuong);
        System.out.println("Nơi đến: " + noiDen);
        System.out.println("Số ngày vận chuyển: " + soNgayVanChuyen);
        System.out.println("Doanh thu: " + doanhThu);
    }
    public double getDoanhThu(){
        return doanhThu;
    }
}
