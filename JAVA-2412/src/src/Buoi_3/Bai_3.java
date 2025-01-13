package Buoi_3;

import java.util.Scanner;

public class Bai_3 {
    public static int nhapSo() {
        Scanner scanner = new Scanner(System.in);
        int so;
        for (so = -1; so <= 0; ) {
            System.out.print("Nhập một số nguyên dương: ");
            so = scanner.nextInt();
        }

        return so;
    }

    public static int uscln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int bscnn(int a, int b) {
        return a * b / uscln(a, b);
    }

    public static void main(String[] args) {
        int a = nhapSo();
        int b = nhapSo();

        int usclnResult = uscln(a, b);
        int bscnnResult = bscnn(a, b);

        System.out.println("USCLN của " + a + " và " + b + " là: " + usclnResult);
        System.out.println("BSCNN của " + a + " và " + b + " là: " + bscnnResult);
    }
}
