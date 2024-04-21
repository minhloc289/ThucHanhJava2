package XayDung;
import java.util.ArrayList;
public class ThoPhu extends Tho{
    public ThoPhu(){};
    public ThoPhu(String maTho, String tenTho, String loaiTho, double mucLuong, ArrayList<Double> dsChamCong){
        super(maTho, tenTho, loaiTho, mucLuong, dsChamCong);
    }
    public void chamCong(double loaiNgay){
        if (loaiNgay == 1){ // ngay thuong
            dsChamCong.add(1.0);
        }
        else if (loaiNgay == 1.5){ // ngay cuoi tuan
            dsChamCong.add(1.5);
        }
        else if (loaiNgay == 0.25){ // nghi co phep
            dsChamCong.add(0.25);
        }
        else if (loaiNgay == 0){ // nghi khong phep
            dsChamCong.add(0.0);
        }
    }
    public double tinhCong(double loaiNgay){
        double cong = 0;
        if (loaiNgay == 1) {
            cong = mucLuong * 1;
        }
        else if (loaiNgay == 1.5){
            cong = mucLuong * 1.5;
        }
        else if (loaiNgay == 0.25){
            cong = mucLuong * 0.25;
        }
        else if (loaiNgay == 0){
            cong = 0;
        }
        return cong;
    }
    public double tinhLuongThang(){
        double luongThang = 0;
        for (int i = 0; i < dsChamCong.size(); i++){
            double luongNgay = tinhCong(dsChamCong.get(i));
            luongThang += luongNgay;
        }
        return luongThang;
    }
}
