package menhdedieukien;

public class if_else_if {
    public  static void main(String[] args) {
        float diemthi = 20;
        if (diemthi >=90){
            System.out.println(diemthi + "điểm giỏi");
        }
        else if (diemthi >=70) {
            System.out.println(diemthi+ "Điểm khá");

        }
        else if (diemthi>=60){
            System.out.println(diemthi+ "điểm trung bình khá");
        } else if (diemthi >=50) {
            System.out.println(diemthi+"điểm trung bình");
            
        } else if (diemthi >=30) {
            System.out.println(diemthi+ " điểm kém");
            
        }
        else {
            System.out.println(diemthi+ " ở lại");
        }
    }
}
