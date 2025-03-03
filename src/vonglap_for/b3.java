package vonglap_for;

public class b3 {
    public static void main(String[] args) {
            int product = 1; // Giá trị khởi tạo phải là 1 vì 1 × số = chính số đó

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
Logic cần thực hiện:

Khởi tạo biến tích (product) với giá trị ban đầu = 1
Dùng vòng lặp chạy từ 3 đến 7
Nhân dồn từng số vào biến tích
In ra các bước tính toán để xem quá trình

int oldProduct = product; // Lưu lại giá trị trước khi nhân
product *= i; // Tương đương product = product * i
System.out.println(...); // In phép tính và kết quả từng bước
Giải thích từng thành phần code
Khởi tạo biến product = 1:

Tích của các số bắt đầu từ 1 vì 1 × số = chính số đó.
Nếu khởi tạo product = 0, kết quả sẽ luôn là 0 (vì 0 × bất kỳ số nào cũng bằng 0).
Vòng lặp for:

int i = 3: Bắt đầu từ số 3
i <=7: Chạy đến khi i =7 (bao gồm cả 7)
i++: Tăng i lên 1 sau mỗi vòng lặp
Logic trong thân vòng lặp:

oldProduct = product: Lưu giá trị tích trước khi nhân để in ra phép tính
product *= i: Tương đương với product = product * i
Câu lệnh System.out.println(...): In ra phép tính và kết quả trung gian
Bài học: Luôn khởi tạo product = 1 khi tính tích.

Khởi tạo i=3
↓
Kiểm tra i <=7 → True
↓
Thực thi thân vòng lặp (product *= i)
↓
In kết quả trung gian
↓
Tăng i lên 1 (i++)
↓
Quay lại kiểm tra điều kiện
... (Lặp lại đến khi i=8 → Dừng)
 */
