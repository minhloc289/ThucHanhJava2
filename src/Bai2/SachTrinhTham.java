package Bai2;

public class SachTrinhTham extends Sach {
    public float thue;
    public SachTrinhTham(){};
    public SachTrinhTham(long maSach, String tenSach, double donGia, int soLuong, String nxb, float thue){
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.thue = thue;
    }
    public void thongtinSach() {
        super.thongtinSach();
        System.out.println("Thuế: " + thue);
    }
    @Override
    public double thanhTien(){
        return (soLuong * donGia) + thue;
    }
}

