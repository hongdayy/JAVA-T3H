package Buoi_4;

public class Buoi_4 {

    public static boolean kiemTraSoDienThoai(String sdt) {

        sdt = sdt.replaceAll("[^0-9-\\.]", "");

        // Kiểm tra các dạng số điện thoại
        if (sdt.length() == 10 && (sdt.startsWith("0") || sdt.startsWith("+84") || sdt.startsWith("84"))) {
            // Kiểm tra nếu số bắt đầu bằng 0 hoặc +84/84 và có đủ 10 số
            String[] parts = sdt.split("[-.]");
            int numberCount = 0;

            // Đếm số lượng chữ số
            for (String part : parts) {
                numberCount += part.length();
            }

            if (numberCount == 10) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] sdtArray = {
                "084123456789",
                "+848412345678",
                "84.841.234.567",
                "084-123-456-789",
                "0812345678"
        };

        for (String sdt : sdtArray) {
            System.out.println(sdt + " hợp lệ: " + kiemTraSoDienThoai(sdt));
        }
    }
}
