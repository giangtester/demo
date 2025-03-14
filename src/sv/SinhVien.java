package sv;
// Class SinhVien (Bản Thiết Kế)
public class SinhVien {
    // Các thuộc tính (đặc điểm)
    String hoTen;
    int tuoi;
    String maSinhVien;

    // Phương thức (hành động)
    public void hocBai() {
        System.out.println(hoTen + " đang học bài");
    }

    public void thamDuLop() {
        System.out.println(hoTen + " đang tham dự lớp học");
    }

    // Class SinhVien.Main để chạy chương trình
    public static class Main {
        public static void main(String[] args) {
            // Tạo đối tượng SinhVien
            SinhVien sinhVien1 = new SinhVien();
            sinhVien1.hoTen = "Nguyễn Văn A";
            sinhVien1.tuoi = 20;
            sinhVien1.maSinhVien = "SV001";

            // Gọi các phương thức
            sinhVien1.hocBai();
            sinhVien1.thamDuLop();
        }}
}