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
/*
 Giải thích cách hoạt động:

Vòng lặp ngoài (i) chạy từ 1 đến 5, mỗi lần lặp đại diện cho một bảng cửu chương.
Vòng lặp trong (j) chạy từ 1 đến 10, in các phép nhân của i.
Kết quả đầu ra:

python-repl
Sao chép
Chỉnh sửa
Bảng cửu chương 1:
1 x 1 = 1
1 x 2 = 2
...
1 x 10 = 10

Bảng cửu chương 2:
2 x 1 = 2
2 x 2 = 4
...
2 x 10 = 20
...
 */