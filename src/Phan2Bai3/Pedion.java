package Phan2Bai3;

public class Pedion extends Robot {
    private int doLinhHoat;
    Pedion(int trongLuong, int doLinhHoat){
        super(trongLuong);
        this.doLinhHoat = doLinhHoat;
    }
    @Override
    public void hienThi(){
        System.out.println("Pedion");
        System.out.println("Trong luong: " + trongLuong + "kg");
        System.out.println("Do linh hoat: " + doLinhHoat);
    }
    public double tinhNangLuongTieuThu(double quangDuong){
        return super.tinhNangLuongTieuThu(quangDuong) + (doLinhHoat + 1)*quangDuong / 2;
    }

}
