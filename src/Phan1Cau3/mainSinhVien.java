package Phan1Cau3;

public class mainSinhVien {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhap thong tin sinh vien 1: ");
        sv1.input();
        System.out.println("Nhap thong tin sinh vien 2: ");
        sv2.input();
        System.out.println("Nhap thong tin sinh vien 3: ");
        sv3.input();
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%10s %17s %10s %10s %10s", "Ma SV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.format("%10d %17s %10.2f %10.2f %10.2f",
                sv1.getmaSV(), sv1.gethoTen(), sv1.getdiemLT(), sv1.getdiemTH(), sv1.diemTB());
        System.out.println();
        System.out.format("%10d %17s %10.2f %10.2f %10.2f",
                sv2.getmaSV(), sv2.gethoTen(), sv2.getdiemLT(), sv2.getdiemTH(), sv2.diemTB());
        System.out.println();
        System.out.format("%10d %17s %10.2f %10.2f %10.2f",
                sv3.getmaSV(), sv3.gethoTen(), sv3.getdiemLT(), sv3.getdiemTH(), sv3.diemTB());
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }
}

