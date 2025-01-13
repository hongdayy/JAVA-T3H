package Buoi_4;

import java.util.HashMap;
import java.util.Map;

public class Buoi_3 {
    public static void main(String[] args) {
        String chuoi = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";

        // a)
        String[] tu = chuoi.toLowerCase().split("\\W+");
        Map<String, Integer> tuCount = new HashMap<>();

        for (String word : tu) {
            if (word.length() > 0) {
                tuCount.put(word, tuCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Số lượng từng từ trong đoạn văn:");
        for (Map.Entry<String, Integer> entry : tuCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " từ");
        }

        // b) V
        String[] words = chuoi.split("\\W+");
        StringBuilder chuoiVietHoa = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                chuoiVietHoa.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase()).append(" ");
            }
        }

        System.out.println("\nChuỗi sau khi viết hoa chữ đầu trong mỗi từ:");
        System.out.println(chuoiVietHoa.toString().trim());

        // c)
        String chuoiXoaNguyenAm = chuoi.replaceAll("[aeiouAEIOU]", "");

        System.out.println("\nChuỗi sau khi xóa các nguyên âm:");
        System.out.println(chuoiXoaNguyenAm);
    }
}
