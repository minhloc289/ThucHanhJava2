package NhaDat;

public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    private int heSo;
    public GiaoDichNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiNha, int heSo) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.heSo = heSo;
    }
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Loai nha: " + loaiNha);
    }
    public double thanhTien(){
        double thanhtien = 0;
        if (loaiNha.equals("Cao cap")){
            thanhtien = dienTich * donGia * heSo;
        }
        else if (loaiNha.equals("Biet thu")){
            thanhtien = dienTich * donGia * heSo * 1.5;
        }
        return thanhtien;
    }
    public void thanhTienVoiThue(){
        double tienVoiThue = 0;
        tienVoiThue = thanhTien() * 0.05;
    }
}
