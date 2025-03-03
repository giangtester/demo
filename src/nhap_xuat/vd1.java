package nhap_xuat;

import java.io.Console;

public class vd1 {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console không khả dụng");
            return;
        }

        char[] password = console.readPassword("Nhập mật khẩu: ");
        console.printf("Mật khẩu có %d ký tự%n", password.length);
    }
}
