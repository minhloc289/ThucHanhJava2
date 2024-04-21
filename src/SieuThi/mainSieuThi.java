package SieuThi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class mainSieuThi {
    public static void main(String[] args) {
        ArrayList<The> dsThe = new ArrayList<>();
        dsThe.add(new TheThanhVien("T0084", "Nguyen X", 4800, "Thanh Vien", new ArrayList<String>(), 0));

        // Thêm tiền mua hàng cho thẻ
        themTienMuaHang(250, "20/4", "T0084",  dsThe);
        themTienMuaHang(4800, "20/5", "T0084", dsThe);
        // Reset thẻ
        resetThe("1/1",dsThe);

        //In danh sach the
        for (int i = 0; i < dsThe.size(); i++){
            The the = dsThe.get(i);
            System.out.println("Ten chu the: " + the.tenChuThe);
            System.out.println("Ma the: " + the.maThe);
            System.out.println("Loai the: " + the.loaiThe);
            System.out.println("Tong tien: " + the.tongTien);
            System.out.println("Ngay thanh toan: " + the.ngayThanhToan);
            System.out.println("Vip years: " + ((TheThanhVien) the).getVipYear());
        }
    }


    public static void themTienMuaHang(double soTien, String ngayMua, String maThe, ArrayList<The> dsThe) {
        for (The the : dsThe) {
            if (the.maThe.equals(maThe)){
                if (ngayMua.equals("1/1")){
                    the.resetThe();
                }
                the.muaHang(soTien, ngayMua);
            }
        }
    }
    public static void resetThe(String ngayReset, ArrayList<The> dsThe){
        if (ngayReset.equals("1/1")){
            for (The the : dsThe){
                the.resetThe();
            }
        }
    }
}
