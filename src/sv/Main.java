package sv;

// Class Main để chạy chương trình
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng SinhVien
        SinhVien sinhVien1 = new SinhVien();
        sinhVien1.hoTen = "Nguyễn Văn A";
        sinhVien1.tuoi = 20;
        sinhVien1.maSinhVien = "SV001";

        // Gọi các phương thức
        sinhVien1.hocBai();
        sinhVien1.thamDuLop();
    }
}