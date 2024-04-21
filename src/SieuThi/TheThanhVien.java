package SieuThi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TheThanhVien extends The {
    private int vipYears;
    public TheThanhVien(){};
    public TheThanhVien(String maThe, String tenChuThe, double tongTien, String loaiThe, ArrayList<String> ngayThanhToan, int vipYears){
        super(maThe, tenChuThe, tongTien, loaiThe, ngayThanhToan);
        this.vipYears = vipYears;
    }
    public int getVipYear(){
        return this.vipYears;
    }
    public void nangCapThe(){
        this.loaiThe = "VIP";
        this.vipYears = 1;
    }
    @Override
    public void muaHang(double soTien, String ngayMua){
        kiemTraMuaHang();
        kiemTraNgayThanhToan(ngayMua);
        this.tongTien += soTien;
        ngayThanhToan.add(ngayMua);
        if (this.tongTien > 5000){
            nangCapThe();
        }
    }
}
