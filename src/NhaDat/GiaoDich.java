package NhaDat;

public abstract class GiaoDich {
    protected String maGiaoDich;
    protected String ngayGiaoDich;
    protected double donGia;
    protected double dienTich;
    public GiaoDich(){};
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    public void inThongTin(){
        System.out.println("Ma giao dich: " + maGiaoDich);
        System.out.println("Ngay giao dich: " + ngayGiaoDich);
        System.out.println("Don gia: " + donGia);
        System.out.println("Dien tich: " + dienTich);
    }

    public abstract double thanhTien();
    public abstract void thanhTienVoiThue();
}
