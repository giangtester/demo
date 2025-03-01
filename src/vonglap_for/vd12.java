package vonglap_for;
public class vd12 {
public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {  // Vòng lặp ngoài: duyệt từ 1 đến 5
        System.out.println("Bảng cửu chương " + i + ":");

        for (int j = 1; j <= 10; j++) {  // Vòng lặp trong: duyệt từ 1 đến 10
            System.out.println(i + " x " + j + " = " + (i * j));
        }

        System.out.println();  // Xuống dòng giữa các bảng
    }
}
}