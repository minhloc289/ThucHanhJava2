package Phan2Bai3;

public class Carrier extends Robot {
    private int sucChua;
    Carrier(int trongLuong, int sucChua){
        super(trongLuong);
        this.sucChua = sucChua;
    }
    @Override
    public void hienThi(){
        System.out.println("Carrier");
        System.out.println("Trong luong: " + trongLuong + "kg");
        System.out.println("Suc chua: " + sucChua + "kg");
    }

    public double tinhNangLuongTieuThu(double quangDuong){
        return super.tinhNangLuongTieuThu(quangDuong) + 4 *sucChua * quangDuong;
    }
}
