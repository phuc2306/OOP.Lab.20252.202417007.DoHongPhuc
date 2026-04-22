package Bai65;
import java.util.Scanner;
import java.util.Arrays; 

public class Numericarray{
    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);


        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = banPhim.nextInt();


        int[] mangSo = new int[n];

  
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            mangSo[i] = banPhim.nextInt();
        }



        Arrays.sort(mangSo);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(mangSo));


        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += mangSo[i]; 
        }

        double trungBinh = (double) tong / n; 


        System.out.println("Tong cac phan tu: " + tong);
        System.out.println("Gia tri trung binh: " + trungBinh);

    }
}