package BTVN1;
import java.util.Scanner;
public class SanXuat extends DienLuc {
    private int loaiDien;
    public SanXuat(){};
    public SanXuat(String maKH, String tenKH, String ngayHD, double soKW, double donGia, int loaiDien){
        super(maKH, tenKH, ngayHD, soKW, donGia);
        this.loaiDien = loaiDien;
    }
    public double thanhTien(){
        double thanhTien = soKW * donGia;
        if (loaiDien == 2 && soKW >= 200){
            thanhTien *= 0.98;
        }
        else if (loaiDien == 3 && soKW > 150){
            thanhTien *= 0.97;
        }
        return thanhTien;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai dien (1: Sinh hoat, 2: San xuat, 3: Kinh doanh): ");
        loaiDien = sc.nextInt();

    }
    public void xuat(){
        super.xuat();
        System.out.println("Loai dien: " + loaiDien);
        System.out.println("Thanh tien: " + thanhTien());
    }
}
