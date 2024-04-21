package Bai2;
abstract class Sach {
    public long maSach;
    public String tenSach;
    public double donGia;
    public int soLuong;
    public String nxb;
    public Sach(){};
    public Sach(long maSach, String tenSach, double donGia, int soLuong, String nxb){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }
    public void thongtinSach() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Nhà xuất bản: " + nxb);
    }
    public abstract double thanhTien(); // Tính thành tiền
}



