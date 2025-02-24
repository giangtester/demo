package switch1;
import java.util.Scanner;
public class vd {
    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào nhiệt độ");
        double t=scanner.nextDouble();
        if (t==100) {
            System.out.println("nước đã đun sôi");
        }
        else {
            System.out.println("nước chưa đun sôi");
        }

    }
}
