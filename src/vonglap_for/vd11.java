package vonglap_for;

import java.util.Scanner;

public class vd11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // In khoảng trắng
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // In dấu *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Xuống dòng
        }
    }
}