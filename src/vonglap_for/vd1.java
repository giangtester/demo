package vonglap_for;
import java.util.Scanner;
public class vd1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("vui lòng nhập số n: ");
        int n=scanner.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++) {
            sum += i;
        }
System.out.println(sum);
    }
}

/*
Bài 3: Tính tổng dãy số
Viết chương trình tính tổng các số từ 1 đến n (với n nhập từ bàn phím).
✅ Gợi ý: Dùng vòng lặp for để cộng dồn vào biến tổng (sum).
 */