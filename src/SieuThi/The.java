package SieuThi;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public abstract class The {
    protected String maThe;
    protected String tenChuThe;
    protected double tongTien;
    protected String loaiThe;
    public ArrayList<String> ngayThanhToan;
    public The(){};
    public The(String maThe, String tenChuThe, double tongTien, String loaiThe, ArrayList<String> ngayThanhToan){
        this.maThe = maThe;
        this.tenChuThe = tenChuThe;
        this.tongTien = tongTien;
        this.loaiThe = loaiThe;
        this.ngayThanhToan = ngayThanhToan;
    }
    public abstract void muaHang(double soTien, String ngayMua);
    public void kiemTraNgayThanhToan(String ngayThanhToan) {
        if (ngayThanhToan.equals("1/1"))
            resetThe();
    }

    public void resetThe(){
        ngayThanhToan.clear();
    }
    public void kiemTraMuaHang() {
        if (!muaHangTrongNam()){
            this.tongTien = 0;
            if (this.loaiThe.equals("VIP")){
                this.loaiThe = "Thanh Vien";
            }
        }
    };

    public boolean muaHangTrongNam(){
        /*return !ngayThanhToan.isEmpty() ;*/
        boolean coMuaHangNamNay = true;
        if (ngayThanhToan.isEmpty()) {
            coMuaHangNamNay = false;
        }
        return coMuaHangNamNay;
    }
}
