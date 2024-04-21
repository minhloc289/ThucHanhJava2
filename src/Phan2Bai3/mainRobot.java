package Phan2Bai3;
import java.util.Scanner;
import java.util.ArrayList;
public class mainRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong robot Pedion: ");
        int numPedion = sc.nextInt();
        System.out.println("Nhap so luong robot Zattacker: ");
        int numZattacker = sc.nextInt();
        System.out.println("Nhap so luong robot Carrier: ");
        int numCarrier = sc.nextInt();
        ArrayList<Robot> robots = new ArrayList<>();
        for (int i = 0; i < numPedion; i++) {
            int doLinhHoat = (int) (Math.random()*5) + 1;
            robots.add(new Pedion(20, doLinhHoat));
        }

        for (int i = 0; i < numZattacker; i++){
            int sucManh = (int) (Math.random()*11) + 20;
            robots.add(new Zattacker(50, sucManh));
        }

        for (int i = 0; i < numCarrier; i++){
            int sucChua = (int) (Math.random()*51) + 50;
            robots.add(new Carrier(30, sucChua));
        }

        double totalEnergy = 0;
        for (Robot robot : robots){
            robot.hienThi();
            double nangLuongTieuThu = robot.tinhNangLuongTieuThu(10);
            System.out.println("Nang luong tieu thu: " + nangLuongTieuThu);
        }

        double maxEnergy = 0;
        String maxEnergyRobotName = "";
        Robot maxEnergyRobot = null;
        for (Robot robot : robots){
            double nangLuongTieuThu = robot.tinhNangLuongTieuThu(10);
            if (nangLuongTieuThu > maxEnergy){
                maxEnergy = nangLuongTieuThu;
                if (robot instanceof Pedion){
                    maxEnergyRobotName = "Pedion";
                } else if (robot instanceof Zattacker){
                    maxEnergyRobotName = "Zattacker";
                } else if (robot instanceof Carrier){
                    maxEnergyRobotName = "Carrier";
                }
            }
        }
        System.out.println("Robot tieu thu nang luong nhieu nhat: " + maxEnergyRobotName);
    }
}
