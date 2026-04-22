package Lab01;

import java.util.Scanner; 

public class Bai225 {

    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        String strSo1 = banPhim.nextLine();
        double so1 = Double.parseDouble(strSo1);

        System.out.print("Nhập số thứ hai: ");
        String strSo2 = banPhim.nextLine();
        double so2 = Double.parseDouble(strSo2);

        double tong = so1 + so2;
        double hieu = so1 - so2;
        double tich = so1 * so2;

        System.out.println("Tổng của hai số : " + tong);
        System.out.println("Hiệu của hai số : " + hieu);
        System.out.println("Tích của hai số : " + tich);

        if (so2 != 0) {
            double thuong = so1 / so2;
            System.out.println("Thương của hai số : " + thuong);
        } else {
            System.out.println("Lỗi: Không thể chia cho 0!");
        }

        banPhim.close(); 
    }
} 