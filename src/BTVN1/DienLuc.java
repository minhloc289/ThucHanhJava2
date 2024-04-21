package BTVN1;
import  java.util.Scanner;
public abstract class DienLuc {
    protected String maKH;
    protected String tenKH;
    protected String ngayHD;
    protected double soKW;
    protected double donGia;

    public DienLuc(){};
    public DienLuc(String maKH, String tenKH, String ngayHD, double soKW, double donGia){
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngayHD = ngayHD;
        this.soKW = soKW;
        this.donGia = donGia;
    }
    abstract public double thanhTien();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        maKH = sc.nextLine();

        System.out.println("Nhap ten khach hang: ");
        tenKH = sc.nextLine();

        System.out.println("Nhap ngay hoa don: ");
        ngayHD = sc.nextLine();

        System.out.println("Nhap so KW tieu thu: ");
        soKW = sc.nextDouble();

        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Ma khach hang: " + maKH);
        System.out.println("Ten khach hang: " + tenKH);
        System.out.println("Ngay hoa don: " + ngayHD);
        System.out.println("So KW tieu thu: " + soKW);
        System.out.println("Don gia: " + donGia);
    }
}
