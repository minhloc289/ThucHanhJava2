package Phan1Cau3;

import java.util.Scanner;
public class SinhVien {
    private int maSV;
    String hoTen;
    float diemLT, diemTH;
    public SinhVien(){};
    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập điểm lý thuyết: ");
        diemLT = sc.nextFloat();
        System.out.print("Nhập điểm thực hành: ");
        diemTH = sc.nextFloat();
    }
    public int getmaSV(){
        return maSV;
    }
    public void setmaSV(int maSV){
        this.maSV = maSV;
    }
    public String gethoTen(){
        return hoTen;
    }
    public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public float getdiemLT(){
        return diemLT;
    }
    public void setdiemLT(float diemLT){
        this.diemLT = diemLT;
    }
    public float getdiemTH(){
        return diemTH;
    }
    public void setdiemTH(float diemTH){
        this.diemTH = diemTH;
    }
    public float diemTB(){
        return (diemLT + diemTH) / 2;
    }

}
