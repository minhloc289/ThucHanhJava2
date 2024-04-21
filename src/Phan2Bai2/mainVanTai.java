package Phan2Bai2;
import java.util.ArrayList;
import java.util.Scanner;
public class mainVanTai {
    public static void main(String[] args) {
        ArrayList<VanTai> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Nhập thông tin chuyến nội thành");
            System.out.println("2. Nhập thông tin chuyến ngoại thành");
            System.out.println("3. Xuất danh sách các chuyến xe");
            System.out.println("4. Tổng doanh thu của các chuyến xe");
            System.out.println("5. Chuyến xe có doanh thu cao nhất của từng loại chuyến");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    if (list.size() < 20){
                        ChuyenNoiThanh noiThanh = new ChuyenNoiThanh();
                        noiThanh.input();
                        list.add(noiThanh);
                    }
                    else{
                        System.out.println("Danh sách đã đầy");
                    }
                    break;
                case 2:
                    if (list.size() < 20){
                        ChuyenNgoaiThanh ngoaiThanh = new ChuyenNgoaiThanh();
                        ngoaiThanh.input();
                        list.add(ngoaiThanh);
                    }
                    else{
                        System.out.println("Danh sách đã đầy");
                    }
                    break;
                case 3:
                    for (VanTai vanTai : list){
                        vanTai.output();
                    }
                    break;
                case 4:
                    double tongDoanhThu = 0;
                    for (VanTai vanTai : list){
                        tongDoanhThu += vanTai.getDoanhThu();
                    }
                    System.out.println("Tổng doanh thu: " + tongDoanhThu);
                    break;
                case 5:
                    ChuyenNoiThanh noiThanhDoanhThuCaoNhat = null;
                    ChuyenNgoaiThanh ngoaiThanhDoanhThuCaoNhat = null;
                    for (VanTai vanTai : list){
                        if (vanTai instanceof ChuyenNoiThanh){
                            if (noiThanhDoanhThuCaoNhat == null || vanTai.getDoanhThu() > noiThanhDoanhThuCaoNhat.getDoanhThu()){
                                noiThanhDoanhThuCaoNhat = (ChuyenNoiThanh) vanTai;
                            }
                        }
                        else if (vanTai instanceof ChuyenNgoaiThanh){
                            if (ngoaiThanhDoanhThuCaoNhat == null || vanTai.getDoanhThu() > ngoaiThanhDoanhThuCaoNhat.getDoanhThu()){
                                ngoaiThanhDoanhThuCaoNhat = (ChuyenNgoaiThanh) vanTai;
                            }
                        }
                    }
                    if (noiThanhDoanhThuCaoNhat != null){
                        System.out.println("Chuyến nội thành có doanh thu cao nhất: ");
                        noiThanhDoanhThuCaoNhat.output();
                    }
                    if (ngoaiThanhDoanhThuCaoNhat != null){
                        System.out.println("Chuyến ngoại thành có doanh thu cao nhất: ");
                        ngoaiThanhDoanhThuCaoNhat.output();
                    }
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai, vui lòng nhập lại");
                    break;
            }
        }
    }
}
