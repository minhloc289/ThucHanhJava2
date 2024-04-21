package Phan2Bai3;

abstract class Robot {
    protected int trongLuong;
    private int nangLuongTieuThu;
    Robot(int trongLuong){
        this.trongLuong = trongLuong;
    }
    abstract public void hienThi();
    public double tinhNangLuongTieuThu(double quangDuong){
        return trongLuong * quangDuong;
    }

}
