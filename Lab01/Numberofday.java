package Bai64;

import java.util.Scanner;

public class Numberofday {
    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nhap thang : ");
            String nhapThang = banPhim.nextLine();

            System.out.print("Nhap nam: ");
            String nhapNam = banPhim.nextLine();


            int nam = -1;
            try {
                nam = Integer.parseInt(nhapNam);
            } catch (Exception e) {
                nam = -1;
            }

            if (nam < 0 || nhapNam.length() < 4) {
                System.out.println("Nam khong hop le. Vui long nhap lai!");
                continue; 
            }


            int soNgay = 0;
            boolean thangHopLe = true;

            if (nhapThang.equals("January") || nhapThang.equals("Jan.") || nhapThang.equals("Jan") || nhapThang.equals("1")) {
                soNgay = 31;
            } else if (nhapThang.equals("February") || nhapThang.equals("Feb.") || nhapThang.equals("Feb") || nhapThang.equals("2")) {
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
            } else if (nhapThang.equals("March") || nhapThang.equals("Mar.") || nhapThang.equals("Mar") || nhapThang.equals("3")) {
                soNgay = 31;
            } else if (nhapThang.equals("April") || nhapThang.equals("Apr.") || nhapThang.equals("Apr") || nhapThang.equals("4")) {
                soNgay = 30;
            } else if (nhapThang.equals("May") || nhapThang.equals("5")) {
                soNgay = 31;
            } else if (nhapThang.equals("June") || nhapThang.equals("Jun.") || nhapThang.equals("Jun") || nhapThang.equals("6")) {
                soNgay = 30;
            } else if (nhapThang.equals("July") || nhapThang.equals("Jul.") || nhapThang.equals("Jul") || nhapThang.equals("7")) {
                soNgay = 31;
            } else if (nhapThang.equals("August") || nhapThang.equals("Aug.") || nhapThang.equals("Aug") || nhapThang.equals("8")) {
                soNgay = 31;
            } else if (nhapThang.equals("September") || nhapThang.equals("Sept.") || nhapThang.equals("Sep") || nhapThang.equals("9")) {
                soNgay = 30;
            } else if (nhapThang.equals("October") || nhapThang.equals("Oct.") || nhapThang.equals("Oct") || nhapThang.equals("10")) {
                soNgay = 31;
            } else if (nhapThang.equals("November") || nhapThang.equals("Nov.") || nhapThang.equals("Nov") || nhapThang.equals("11")) {
                soNgay = 30;
            } else if (nhapThang.equals("December") || nhapThang.equals("Dec.") || nhapThang.equals("Dec") || nhapThang.equals("12")) {
                soNgay = 31;
            } else {
                thangHopLe = false;
            }


            if (thangHopLe) {
                System.out.println("Thang " + nhapThang + " nam " + nam + " co " + soNgay + " ngay.");
                break; 
            } else {
                System.out.println("Thang khong hop le. Vui long nhap lai!");
            }
        }
        
        banPhim.close();
    }
}