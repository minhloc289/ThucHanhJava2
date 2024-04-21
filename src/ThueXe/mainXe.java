package ThueXe;

import java.util.ArrayList;
import java.util.TreeMap;

public class mainXe {
    public static void main(String[] args) {
        ArrayList<Xe> dsXe = new ArrayList<>();
        dsXe.add(new XeOto("51K.XXXXX", "Toyota", "Camry", 1000000, "Oto", new TreeMap<String, String>(), "A"));
        themThueXe("51K.XXXXX", "10/4/2022", "13/4/2022",dsXe);
        LietKe(dsXe);
    }
    public static void themThueXe(String bienSo, String ngayThue, String ngayTra, ArrayList<Xe> dsXe){
        for (Xe xe : dsXe){
            if (xe.bienSoXe.equals(bienSo)){
                xe.thueXe(ngayThue,ngayTra);
                xe.tinhTienXe();
            }
        }
    }
    public static void LietKe(ArrayList<Xe> dsXe){
        for (Xe xe : dsXe){
            if (xe instanceof XeOto oto){
                System.out.println("Bien so: " + oto.bienSoXe);
                System.out.println("Hang xe: " + oto.hangXe);
                System.out.println("Ten xe: " + oto.tenXe);
                System.out.println("Type: " + oto.type);
                System.out.println("Ngay thue: " + oto.ngayThueTra.firstKey());
            }
        }
    }
}
