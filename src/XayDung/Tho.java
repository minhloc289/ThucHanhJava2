package XayDung;
import java.util.ArrayList;
public abstract class Tho {
    protected String maTho;
    protected String tenTho;
    protected String loaiTho;
    protected double mucLuong;
    public ArrayList<Double> dsChamCong;
    public Tho(){};
    public Tho(String maTho, String tenTho, String loaiTho, double mucLuong, ArrayList<Double> dsChamCong){
        this.maTho = maTho;
        this.tenTho = tenTho;
        this.loaiTho = loaiTho;
        this.mucLuong = mucLuong;
        this.dsChamCong = dsChamCong;
    }
    public abstract double tinhCong(double loaiNgay);
    public abstract void chamCong(double loaiNgay);
    public abstract double tinhLuongThang();
}

