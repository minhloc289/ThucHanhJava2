package Phan2Bai3;

public class Zattacker extends Robot{
    private int sucManh;
    Zattacker(int trongLuong, int sucManh){
        super(trongLuong);
        this.sucManh = sucManh;
    }
    @Override
    public void hienThi(){
        System.out.println("Zattacker");
        System.out.println("Trong luong: " + trongLuong + "kg");
        System.out.println("Suc manh: " + sucManh + "kg");
    }

    public double tinhNangLuongTieuThu(double quangDuong){
        return super.tinhNangLuongTieuThu(quangDuong) + sucManh * sucManh * quangDuong;
    }
}
