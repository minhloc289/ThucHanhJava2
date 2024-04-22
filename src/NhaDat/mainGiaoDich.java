package NhaDat;

import java.util.ArrayList;
import java.util.Scanner;
public class mainGiaoDich {
    public static void main(String[] args) {
        ArrayList<GiaoDich> dsGD = new ArrayList<>();
        nhapDS(dsGD);
        xuatTongTien(dsGD, "10/2018");
    }
    public static void nhapDS(ArrayList<GiaoDich> dsGD){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhap ma giao dich: ");
            String maGiaoDich = sc.nextLine();

            System.out.println("Nhap ngay giao dich: ");
            String ngayGiaoDich = sc.nextLine();

            System.out.println("Nhap don gia: ");
            double donGia = sc.nextDouble();

            System.out.println("Nhap dien tich: ");
            double dienTich = sc.nextDouble();

            System.out.println("Nhap loai giao dich (D: Dat, N: Nha): ");
            String loaiGiaoDich = sc.nextLine();

            if (loaiGiaoDich.equals("D")){
                System.out.println("Nhap loai dat (A, B): ");
                String loaiDat = sc.nextLine();
                GiaoDichDat gd = new GiaoDichDat(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiDat);
                dsGD.add(gd);
            }
            else if (loaiGiaoDich.equals("N")){
                System.out.println("Nhap loai nha (Cao cap, Biet thu): ");
                String loaiNha = sc.nextLine();
                System.out.println("Nhap he so: ");
                int heSo = sc.nextInt();
                GiaoDichNha gd = new GiaoDichNha(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiNha, heSo);
                dsGD.add(gd);
            }
            if (maGiaoDich.isEmpty())
                break;
        }
    }
    public static void xuatTongTien(ArrayList<GiaoDich> dsGD, String ngayGD){
        for (GiaoDich gd : dsGD){
            if (gd.ngayGiaoDich.contains("10/2018")){
                System.out.println("Loai giao dich: " + gd.getClass().getName());
                System.out.println("Tong tien: " + gd.thanhTien());
            }
        }
    }

}
