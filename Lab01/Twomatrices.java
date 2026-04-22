package Bai66;


import java.util.Scanner;

public class Twomatrices {
    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);


        System.out.print("Nhap so hang của ma tran: ");
        int hang = banPhim.nextInt();
        System.out.print("Nhap so cot của ma tran: ");
        int cot = banPhim.nextInt();

        int[][] maTran1 = new int[hang][cot];
        int[][] maTran2 = new int[hang][cot];
        int[][] maTranTong = new int[hang][cot];

        System.out.println("Nhap phan tu cho ma tran thu nhat:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Ma tran 1 [" + i + "][" + j + "] = ");
                maTran1[i][j] = banPhim.nextInt();
            }
        }

        System.out.println("Nhap phan tu cho ma tran thu hai:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Ma tran 2 [" + i + "][" + j + "] = ");
                maTran2[i][j] = banPhim.nextInt();
            }
        }

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                maTranTong[i][j] = maTran1[i][j] + maTran2[i][j];
            }
        }

        System.out.println("\nKet qua cong hai ma tran la:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(maTranTong[i][j] + "\t"); 
            }
            System.out.println(); 
        }

    }
}