package SieuThi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class TheVIP extends The {
    private int vipYears;
    public TheVIP(){};
    public TheVIP(String maThe, String tenChuThe, double tongTien, String loaiThe, ArrayList<String> ngayThanhToan, int vipYears){
        super(maThe, tenChuThe, tongTien, loaiThe, ngayThanhToan);
        this.vipYears = vipYears;
    }
    @Override
    public void muaHang(double soTien, String ngayMua){
        kiemTraMuaHang();
        kiemTraNgayThanhToan(ngayMua);
        double phanTramThuong = Math.max(vipYears * 0.05, 0.2);
        this.tongTien += soTien + (soTien * phanTramThuong);
        ngayThanhToan.add(ngayMua);
    }


}
