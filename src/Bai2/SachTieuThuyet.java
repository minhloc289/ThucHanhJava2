package Bai2;

public class SachTieuThuyet extends Sach {
    public String tinhTrang;
    public SachTieuThuyet(){};
    public SachTieuThuyet(long maSach, String tenSach, double donGia, int soLuong, String nxb, String tinhTrang){
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.tinhTrang = tinhTrang;
    }

    public void thongtinSach() {
        super.thongtinSach();
        System.out.println("Tình trạng: " + tinhTrang);
    }
    @Override
    public double thanhTien(){
        if (tinhTrang == "mới") {
            return soLuong * donGia;
        }
        else if (tinhTrang == "cũ") {
            return (soLuong * donGia) * 0.2;
        }
        return 0;
    }
}

