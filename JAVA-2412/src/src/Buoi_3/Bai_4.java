package Buoi_3;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int so = scanner.nextInt();
        int soDaoNguoc = 0;

        while (so != 0) {
            int chuSo = so % 10;
            soDaoNguoc = soDaoNguoc * 10 + chuSo;
            so /= 10;
        }

        System.out.println("Số đảo ngược là: " + soDaoNguoc);
    }
}
