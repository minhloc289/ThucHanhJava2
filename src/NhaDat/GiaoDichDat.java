package NhaDat;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    public GiaoDichDat(){};

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Loai dat: " + loaiDat);
    }
    public double thanhTien(){
        double thanhtien = 0;
        if (loaiDat.equals("A")){
            thanhtien = dienTich * donGia;
        }
        else if (loaiDat.equals("B")){
            thanhtien = dienTich * donGia * 2.0;
        }
        return thanhtien;
    }
    public void thanhTienVoiThue(){
        double tienVoiThue = 0;
        tienVoiThue = thanhTien() * 0.1;
    }
}
