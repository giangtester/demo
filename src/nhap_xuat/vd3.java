package nhap_xuat;
import java.util.Scanner;
public class vd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập một số: ");
            int number = scanner.nextInt();
            System.out.println("Số bạn vừa nhập: " + number);
        } catch (Exception e) {
            System.out.println("❌ Lỗi: Bạn phải nhập một số!");
        }
    }
}
