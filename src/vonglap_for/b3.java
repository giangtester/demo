package vonglap_for;

public class b3 {
    public static void main(String[] args) {
            int product = 1;

            for (int i = 3; i <= 7; i++) {
                int oldProduct = product; // Lưu giá trị cũ để in
                product *= i;             // Tính tích mới
                System.out.println(oldProduct + " × " + i + " = " + product);
            }

            System.out.println("Kết quả cuối cùng: " + product);
        }
    }



/*
Bài tập thực hành
Yêu cầu: Viết vòng lặp for thực hiện các tác vụ sau:

Tính tích các số từ 3 đến 7 (3×4×5×6×7)
 */
