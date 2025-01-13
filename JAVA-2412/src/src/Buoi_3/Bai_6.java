package Buoi_3;

public class Bai_6 {
    public static void main(String[] args) {
        int tongTien = 200000;

        for (int soTo5000 = 0; soTo5000 <= tongTien / 5000; soTo5000++) {
            for (int soTo2000 = 0; soTo2000 <= (tongTien - soTo5000 * 5000) / 2000; soTo2000++) {
                for (int soTo1000 = 0; soTo1000 <= (tongTien - soTo5000 * 5000 - soTo2000 * 2000) / 1000; soTo1000++) {
                    if (soTo5000 * 5000 + soTo2000 * 2000 + soTo1000 * 1000 == tongTien) {
                        System.out.println("5000đ: " + soTo5000 + ", 2000đ: " + soTo2000 + ", 1000đ: " + soTo1000);
                    }
                }
            }
        }
    }
}
