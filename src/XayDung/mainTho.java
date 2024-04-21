package XayDung;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class mainTho {
    public static void main(String[] args) {
        ArrayList<Tho> dsTho = new ArrayList<>();
        dsTho.add(new ThoChinh("TH013", "Nguyen A", "Tho chinh", 100000, new ArrayList<Double>(), 1));
        dsTho.add(new ThoPhu("TH014", "Nguyen B", "Tho phu", 50000, new ArrayList<Double>()));
        ChamCongTho("Nguyen A", "TH013", dsTho, 0.5);
        ChamCongTho("Nguyen B", "TH014", dsTho, 1);
        for (int i = 0; i < dsTho.size(); i++){
            LietKet(dsTho.get(i));
        }
    }
    public static void ChamCongTho(String tenTho, String maTho, ArrayList<Tho> dsTho, double loaiNgay){
        for (int i = 0; i < dsTho.size(); i++){
            if (dsTho.get(i).tenTho == tenTho && dsTho.get(i).maTho == maTho){
                dsTho.get(i).chamCong(loaiNgay);
            }
        }
    }
    public static void LietKet(Tho tho){
        int soNgayLamViec = tho.dsChamCong.size();
        int soNgayNghiCoPhep = 0;
        int soNgayNghiKhongPhep = 0;
        for (int i = 0; i < tho.dsChamCong.size(); i++){
            if (tho.loaiTho == "Tho chinh"){
                if (tho.dsChamCong.get(i) == 0.5){
                    soNgayNghiCoPhep++;
                }
            }
            else if (tho.loaiTho == "Tho phu"){
                if (tho.dsChamCong.get(i) == 0.25){
                    soNgayNghiCoPhep++;
                }
            }
            else if (tho.dsChamCong.get(i) == 0){
                soNgayNghiKhongPhep++;
            }
        }
        System.out.println("Ma tho: " + tho.maTho);
        System.out.println("Ten tho: " + tho.tenTho);
        System.out.println("Loai tho: " + tho.loaiTho);
        System.out.println("So ngay lam viec: " + soNgayLamViec);
        System.out.println("So ngay nghi co phep: " + soNgayNghiCoPhep);
        System.out.println("So ngay nghi khong phep: " + soNgayNghiKhongPhep);
        System.out.println("Luong thang: " + tho.tinhLuongThang());
    }
}
