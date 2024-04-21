package ThueXe;

import java.util.TreeMap;

public class XeOto extends Xe {
    private String loaiXe;
    public XeOto(){};

    public XeOto(String bienSoXe, String hangXe, String tenXe, double donGia, String type, TreeMap<String, String> ngayThueTra, String loaiXe) {
        super(bienSoXe, hangXe, tenXe, donGia, type, ngayThueTra);
        this.loaiXe = loaiXe;
    }

    public String getLoaiXe(){
        return this.loaiXe;
    }
    @Override
    public double heSo() {
        if (this.loaiXe.equals("A")){
            return 1.0;
        }
        else if (this.loaiXe.equals("B")){
            return 1.5;
        }
        return 2.0;
    }

    @Override
    public double tinhTienXe() {
        if (soNgayThue() >= 3){
            return super.tinhTienXe() * 0.9;
        }
        else
            return super.tinhTienXe();
    }
}
