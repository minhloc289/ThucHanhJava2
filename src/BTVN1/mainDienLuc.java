package BTVN1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class mainDienLuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DienLuc> danhSachKH = new ArrayList<>();

        // Nhập thông tin khách hàng
        while (true) {
            System.out.println("Nhập loại khách hàng (Sinh hoạt, Kinh doanh, Sản xuất) (rỗng để kết thúc): ");
            String loaiKH = scanner.nextLine();
            if (loaiKH.isEmpty()) break;

            DienLuc kh = null;
            if (loaiKH.equalsIgnoreCase("Sinh hoạt")) {
                kh = new SinhHoat();
            } else if (loaiKH.equalsIgnoreCase("Kinh doanh")) {
                kh = new KinhDoanh();
            } else if (loaiKH.equalsIgnoreCase("Sản xuất")) {
                kh = new SanXuat();
            } else {
                System.out.println("Loại khách hàng không hợp lệ!");
                continue;
            }

            kh.nhap();

            // Kiểm tra trùng lặp mã khách hàng và tên khách hàng cùng loại điện sử dụng
            if (kiemTraTrungLapKhachHang(danhSachKH, kh)) {
                System.out.println("Mã khách hàng và tên khách hàng đã tồn tại với cùng loại điện sử dụng. Vui lòng nhập lại.");
                continue;
            }

            danhSachKH.add(kh);
        }

        // Xuất hóa đơn
        for (DienLuc kh : danhSachKH) {
            System.out.println("Thông tin hóa đơn của khách hàng:");
            kh.xuat();
            System.out.println();
        }

        scanner.close();
    }

    // Kiểm tra trùng lặp mã khách hàng và tên khách hàng cùng loại điện sử dụng
    private static boolean kiemTraTrungLapKhachHang(ArrayList<DienLuc> danhSachKH, DienLuc khMoi) {
        for (DienLuc kh : danhSachKH) {
            if (kh.maKH.equals(khMoi.maKH) && kh.tenKH.equals(khMoi.tenKH)) {
                if (kh instanceof SinhHoat && khMoi instanceof SinhHoat) {
                    return true;
                } else if (kh instanceof KinhDoanh && khMoi instanceof KinhDoanh) {
                    return true;
                } else if (kh instanceof SanXuat && khMoi instanceof SanXuat) {
                    return true;
                }
            }
        }
        return false;
    }
}
