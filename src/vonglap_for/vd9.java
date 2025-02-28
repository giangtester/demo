package vonglap_for;
import java.util.Scanner;
public class vd9 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("vui long nhập vào n ");
        int n= scanner.nextInt();
        int i,j;
        for (i =1;i<=n;i++){
            for (j=1;j<i;j++)

            {

                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }}
}
