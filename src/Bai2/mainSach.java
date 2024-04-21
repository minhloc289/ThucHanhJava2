package Bai2;

public class mainSach {
    public static void main(String[] args) {
        SachTieuThuyet stt = new SachTieuThuyet(1, "Sach 1", 10000, 10, "NXB 1", "cũ");
        SachTrinhTham stt1 = new SachTrinhTham(2, "Sach 2", 20000, 20, "NXB 2", 2000);
        System.out.println("Thông tin sách tiểu thuyết: ");
        stt.thongtinSach();
        System.out.println("Thành tiền sách tiểu thuyết: " + stt.thanhTien());
        System.out.println("------------------------------------------------");
        System.out.println("Thông tin sách trinh thám: ");
        stt1.thongtinSach();
        System.out.println("Thành tiền sách trinh thám: " + stt1.thanhTien());
    }
}

