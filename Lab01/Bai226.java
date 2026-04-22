package Lab01;

import java.util.Scanner;

public class Bai226 {

    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);

        System.out.println("1. Bac nhat 1 an (ax + b = 0)");
        System.out.println("2. He bac nhat 2 an");
        System.out.print("Chon (1 hoac 2): ");
        int chon = banPhim.nextInt();

        if (chon == 1) {
            System.out.print("Nhap a: ");
            double a = banPhim.nextDouble();
            System.out.print("Nhap b: ");
            double b = banPhim.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -b / a;
                System.out.println("Nghiem x = " + x);
            }

        } else if (chon == 2) {
 
            System.out.println("Nhap cac he so cho: a11*x1 + a12*x2 = b1");
            System.out.print("a11: "); double a11 = banPhim.nextDouble();
            System.out.print("a12: "); double a12 = banPhim.nextDouble();
            System.out.print("b1: ");  double b1  = banPhim.nextDouble();

            System.out.println("Nhap cac he so cho: a21*x1 + a22*x2 = b2");
            System.out.print("a21: "); double a21 = banPhim.nextDouble();
            System.out.print("a22: "); double a22 = banPhim.nextDouble();
            System.out.print("b2: ");  double b2  = banPhim.nextDouble();

            double D  = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            if (D != 0) {
                double x1 = D1 / D;
                double x2 = D2 / D;
                System.out.println("He co nghiem duy nhat: x1 = " + x1 + ", x2 = " + x2);
            } else {
                if (D1 == 0 && D2 == 0) {
                    System.out.println("He co vo so nghiem");
                } else {
                    System.out.println("He vo nghiem");
                }
            }
        }
        
        banPhim.close();
    }
}