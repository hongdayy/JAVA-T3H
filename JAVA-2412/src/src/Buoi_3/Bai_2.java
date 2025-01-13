package Buoi_3;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Nhập giá trị n: ");
        n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 3);
        }

        System.out.println("Tổng S(n) = " + sum);
    }
}
