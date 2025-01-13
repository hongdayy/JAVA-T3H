package Buoi_3;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương: ");
        int n = scanner.nextInt();
        String nhiPhan = "";

        while (n > 0) {
            int du = n % 2;
            nhiPhan = du + nhiPhan;
            n /= 2;
        }

        System.out.println("Số nhị phân là: " + nhiPhan);
    }
}
