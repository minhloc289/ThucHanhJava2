package XayDung;
import  java.util.ArrayList;
public class ThoChinh extends Tho {
    private float heSoTho;
    public ThoChinh(){};
    public ThoChinh(String maTho, String tenTho, String loaiTho, double mucLuong, ArrayList<Double> dsChamCong, float heSoTho){
        super(maTho, tenTho, loaiTho, mucLuong, dsChamCong);
        this.heSoTho = heSoTho;
    }
    @Override
    public void chamCong(double loaiNgay){
        if (loaiNgay == 1){
            dsChamCong.add(1.0);
        }
        else if (loaiNgay == 2){
            dsChamCong.add(2.0);
        }
        else if (loaiNgay == 0.5){
            dsChamCong.add(0.5);
        }
        else if (loaiNgay == 0){
            dsChamCong.add(0.0);
        }
    }
    @Override
    public double tinhCong(double loaiNgay){
        double cong = 0;
        if (loaiNgay == 1) {
            cong = mucLuong * 1;
        }
        else if (loaiNgay == 2){
            cong = mucLuong * 2;
        }
        else if (loaiNgay == 0.5){
            cong = mucLuong * 0.5;
        }
        else if (loaiNgay == 0){
            cong = 0;
        }
        return cong;
    }
    @Override
    public double tinhLuongThang(){
        double luongThang = 0;
        for (int i = 0; i < dsChamCong.size(); i++){
            double luongNgay = tinhCong(dsChamCong.get(i));
            luongThang += luongNgay;
        }
        return luongThang * heSoTho;
    }
}
