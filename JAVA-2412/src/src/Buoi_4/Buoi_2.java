package Buoi_4;

import java.util.Arrays;
import java.util.Scanner;

public class Buoi_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ newline sau khi nhập số

        String[] hoten = new String[n];
        double[] diem = new double[n];
        String[] hocluc = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
            hoten[i] = scanner.nextLine();
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();
            scanner.nextLine();  // Đọc bỏ newline sau khi nhập điểm

            if (diem[i] < 5) {
                hocluc[i] = "Yếu";
            } else if (diem[i] >= 5 && diem[i] < 6.5) {
                hocluc[i] = "Trung bình";
            } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                hocluc[i] = "Khá";
            } else if (diem[i] >= 7.5 && diem[i] < 9) {
                hocluc[i] = "Giỏi";
            } else {
                hocluc[i] = "Xuất sắc";
            }
        }

        System.out.println("\nDanh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println(hoten[i] + " - Điểm: " + diem[i] + " - Học lực: " + hocluc[i]);
        }

        // Sắp xếp mảng theo điểm
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    String tempHoten = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = tempHoten;

                    String tempHocluc = hocluc[i];
                    hocluc[i] = hocluc[j];
                    hocluc[j] = tempHocluc;
                }
            }
        }

        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println(hoten[i] + " - Điểm: " + diem[i] + " - Học lực: " + hocluc[i]);
        }

        scanner.close();
    }
}
