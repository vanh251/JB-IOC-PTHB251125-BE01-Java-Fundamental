package session05;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("\n--- Kết quả phân tích chuỗi ---");

        if (!input.isBlank()) {
            System.out.println("- Thỏa mãn: Chuỗi không để trống.");
        } else {
            System.out.println("- Vi phạm: Chuỗi bị trống hoặc chỉ có khoảng trắng.");
        }

        if (input.matches("^[a-zA-Z0-9 ]*$")) {
            System.out.println("- Thỏa mãn: Không chứa ký tự đặc biệt.");
        }

        if (input.matches("^[^0-9]*$")) {
            System.out.println("- Thỏa mãn: Không chứa ký tự số.");
        }

        if (input.matches("^[0-9]+$")) {
            System.out.println("- Thỏa mãn: Chỉ chứa toàn ký tự số.");
        }

        if (input.matches("^[a-zA-Z]+$")) {
            System.out.println("- Thỏa mãn: Chỉ chứa toàn ký tự chữ cái.");
        }

        scanner.close();
    }
}