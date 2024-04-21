package ThueXe;
import java.util.TreeMap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public abstract class Xe {
    protected String bienSoXe;
    protected String hangXe;
    protected String tenXe;
    protected double donGia;
    protected String type;
    public TreeMap<String, String> ngayThueTra = new TreeMap<>();
    public Xe(){};

    public Xe(String bienSoXe, String hangXe, String tenXe, double donGia, String type, TreeMap<String, String> ngayThueTra) {
        this.bienSoXe = bienSoXe;
        this.hangXe = hangXe;
        this.tenXe = tenXe;
        this.donGia = donGia;
        this.type = type;
        this.ngayThueTra = ngayThueTra;
    }

    public void thueXe(String ngayThue, String ngayTra){
        ngayThueTra.put(ngayThue, ngayTra);
    }
    public void traXe(){
        ngayThueTra.clear();
    }
    public int soNgayThue() { // kien thức mới
        String ngayThue = ngayThueTra.firstKey();
        String ngayTra = ngayThueTra.get(ngayThue);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy");

        LocalDate date1 = LocalDate.parse(ngayThue, formatter);
        LocalDate date2 = LocalDate.parse(ngayTra, formatter);

        int daysDiff = (int) ChronoUnit.DAYS.between(date1, date2);
        return daysDiff;
    }

    public abstract double heSo();
    public double tinhTienXe(){
        return donGia * soNgayThue() * heSo();
    }
}
