package Buoi_4;

import java.util.Arrays;
import java.util.Scanner;

public class Buoi_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhập các phần tử trong mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        Arrays.sort(mang);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();

        System.out.println("Phần tử có giá trị nhỏ nhất: " + mang[0]);

        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0) {
                tong += mang[i];
                dem++;
            }
        }

        if (dem > 0) {
            double trungBinh = (double) tong / dem;
            System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + trungBinh);
        } else {
            System.out.println("Không có phần tử nào chia hết cho 3.");
        }

        scanner.close();
    }
}
