package bienvadulieu;

public class toantu
{ public static void main(String[] args){
    int a=10,b=5;
    int min = (a<b) ? a:b;
    int max = (a>b) ? a:b;
    String ketqua= (a%2 ==0 )? "a la so chẵn" :"a là số lẻ" ;
    String ketqua2 =(a>=0) ? "a là số dương": "a là số âm";
    String ketqua3 = (a>0) ? "a là số dương" : (a<0) ? "a là số âm" : "a là số 0";
    System.out.println(ketqua3);
    System.out.println(ketqua2);
    System.out.println(ketqua);
    System.out.println("Số lơn hơn là: " + max);
    System.out.println(min);
    System.out.println(a>b);
    System.out.println(a==b);
    System.out.println((a>b)&&(b>0));
    System.out.println((a<b)||(b<0));
    System.out.println(!(a>b));
    System.out.println(a++);
    System.out.println(++a);
    System.out.println(b--);
    System.out.println(--b);

}
}
