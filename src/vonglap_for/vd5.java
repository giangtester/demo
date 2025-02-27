package vonglap_for;
import java.util.Scanner;
public class vd5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("vui long nhập số n: ");
        int n=scanner.nextInt();
        int phepnhan=0;
        for (int i=1;i<=10;i++){
            phepnhan = n*i;
            System.out.println(n +"*"+ i+"="+n*i);
        }


    }
}
 /*
 bài toaán phép nhân nhập nào số n
  */