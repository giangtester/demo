package nhap_xuat;
import java.util.Scanner;
public class vd2 {
    public static void main(String[] args){
        String ten;
        Scanner scanner=new Scanner(System.in);
        System.out.print("vui long nhap ten: ");
        ten= scanner.nextLine();
        System.out.print("vui long nhap tuoi: ");
        int tuoi=scanner.nextInt();
        System.out.print("vui lòng nhập số short ");
        Short s =scanner.nextShort();
        System.out.print("vui long nhập kiểu long");
        long l=scanner.nextLong();
        System.out.print("vui lòng nhập kiểu double");
        Double d=scanner.nextDouble();
        System.out.print("vui  long nhập char");
        char c=scanner.next().charAt(0);

        scanner.close();
        System.out.print("xin chào \t"+ten);
        System.out.println("tôi 20 tuổi \n");
        System.out.println("tuôi học lớp 12 \'");
        System.out.println("tôi là nữ \" ");

    }}

