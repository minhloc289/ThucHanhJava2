package Bai1;

public class TaiKhoan {
    public long soTK;
    public String tenTK;
    public double soTien;
    public TaiKhoan(){};
    public TaiKhoan(long soTK, String tenTK, double soTien){
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public void inTK(){
        System.out.println("Số tài khoản: " + soTK);
        System.out.println("Tên tài khoản: " + tenTK);
        System.out.println("Số tiền: " + soTien);
    }

    public boolean napTien(double st){
        if(st > 0){
            this.soTien += st;
            return true;
        }
        return false;
    }

    public boolean chuyenKhoan(TaiKhoan a, double st){
        if(st > 0 && st <= this.soTien){
            this.soTien -= st;
            a.soTien += st;
            return true;
        }
        else{
            System.out.println("Số dư không đủ để thực hiện giao dịch!");
        }
        return false;
    }
}

