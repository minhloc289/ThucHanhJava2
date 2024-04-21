package Bai1;
public class mainTaiKhoan {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan(28092004, "Cai Ngoc Minh Loc", 1000000);
        TaiKhoan tk2 = new TaiKhoan(1690889439, "Cai Ngoc Minh Loc", 2000000);
        System.out.println("Thông tin tài khoản 1: ");
        tk1.inTK();
        System.out.println("Thông tin tài khoản 2: ");
        tk2.inTK();
        System.out.println("Nạp 10 triệu vào tài khoản 1");
        tk1.napTien(1000000);
        System.out.println("Nạp 20 triệu vào tài khoản 2");
        tk2.napTien(2000000);
        System.out.println("Thông tin tài khoản 1 sau khi nạp tiền: ");
        tk1.inTK();
        System.out.println("Thông tin tài khoản 2 sau khi nạp tiền: ");
        tk2.inTK();
        System.out.println("Chuyển 5 triệu từ tài khoản 1 sang tài khoản 2: ");
        tk1.chuyenKhoan(tk2, 5000000);

    }
}

