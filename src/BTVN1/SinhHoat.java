package BTVN1;
import  java.util.Scanner;
public class SinhHoat extends DienLuc{
    private double dinhMuc;
    public SinhHoat(){};
    public SinhHoat(String maKH, String tenKH, String ngayHD, double soKW, double donGia, double dinhMuc){
        super(maKH, tenKH, ngayHD, soKW, donGia);
        this.dinhMuc = dinhMuc;
    }
    public double thanhTien(){
        if (soKW <= dinhMuc){
            return soKW * donGia;
        }
        else
            return soKW * donGia * dinhMuc + (soKW - dinhMuc) * dinhMuc * donGia * 2;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dinh muc: ");
        dinhMuc = sc.nextDouble();
    }
    public void xuat(){
        super.xuat();
        System.out.println("Dinh muc: " + dinhMuc);
        System.out.println("Thanh tien: " + thanhTien());
    }
}
