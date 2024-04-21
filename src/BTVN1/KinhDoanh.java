package BTVN1;
public class KinhDoanh extends DienLuc {
    public KinhDoanh(){};
    public KinhDoanh(String maKH, String tenKH, String ngayHD, double soKW, double donGia){
        super(maKH, tenKH, ngayHD, soKW, donGia);
    }
    public double thanhTien(){
        if (soKW >= 400){
            return soKW * donGia * 0.05;
        }
        else
            return soKW * donGia;
    }
    public void nhap(){
        super.nhap();
    }
    public void xuat(){
        super.xuat();
        System.out.println("Thanh tien: " + thanhTien());
    }
}
