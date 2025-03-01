package vonglap_for;
import java.util.Scanner;
public class vd9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vui long nhập vào n ");
        int n = scanner.nextInt();
        int i, j;   System.out.println("tam giác sao cân ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/*
Bài toán: In tam giác cân bằng dấu *
Viết chương trình in ra tam giác cân có chiều cao n.

Ví dụ, nếu n = 5, kết quả mong muốn là:

    *
   ***
  *****
 *******
*********
 */