package Buoi_3;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập giá trị n (n dương): ");
            n = scanner.nextInt();
        } while (n <= 0);

        int a = 1, b = 1; // f(1) và f(2) = 1
        System.out.print("Dãy Fibonacci: ");

        if (n == 1) {
            System.out.println(a);
        } else {
            System.out.print(a + " " + b + " "); // In f(1) và f(2)
            for (int i = 3; i <= n; i++) {
                int next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
        }
    }
}
