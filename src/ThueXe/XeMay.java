package ThueXe;

import java.util.TreeMap;

public class XeMay extends Xe {
    private double dungTich;
    public XeMay(){};

    public XeMay(String bienSoXe, String hangXe, String tenXe, double donGia, String type, TreeMap<String, String> ngayThueTra, double dungTich) {
        super(bienSoXe, hangXe, tenXe, donGia, type, ngayThueTra);
        this.dungTich = dungTich;
    }
    @Override
    public double heSo(){
        if (this.dungTich < 150){
            return 1.0;
        }
        else
            return 2.0;
    }
}
