package switch1;
import java.util.Scanner;
public class khong_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số a");
        double a = scanner.nextInt();
        System.out.println("nhập vào số b");
        double b = scanner.nextInt();
        System.out.println("lựa chọn phép tính +,-,*,/");
        char pheptinh = scanner.next().charAt(0);
        double ketqua =0;
        switch (pheptinh) {
            case '+':
                ketqua = a + b;
                break;
            case '-':
                ketqua = a - b;
                break;
            case '*':
                ketqua = a * b;
                break;
            case '/':
                if  (b == 0){ System.out.println("không hợp lệ"); return;
            } else {
                ketqua =  a/b;
                System.out.println(ketqua);
            }
            break;
            default:
                System.out.println("không hợp lệ");
        }
            System.out.println(ketqua);
            scanner.close();

    }
}