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
/*Viết chương trình in ra tam giác cân có chiều cao n.

Ví dụ, nếu n = 5, kết quả mong muốn là:

    *
   ***
  *****
 *******
*********
Tam giác cân có:
n dòng (chiều cao của tam giác).
Mỗi dòng có số lượng dấu * tăng dần từ 1 đến (2n - 1).
Cần căn chỉnh sao cho tam giác nằm giữa (dùng khoảng trắng ' ').
Số khoảng trắng = n - i.
Số * = (2 * i - 1).

T✅ Vòng lặp ngoài (i): Điều khiển số dòng.
✅ Vòng lặp trong 1 (j - khoảng trắng): Căn chỉnh tam giác.
✅ Vòng lặp trong 2 (j - dấu *): In số lượng dấu * đúng với mỗi dòng.
✅ Xuống dòng (System.out.println()) để bắt đầu dòng mới..*/