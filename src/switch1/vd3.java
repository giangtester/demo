package switch1;

public class vd3 {
    public void sayhello(){
        int n=10;
        System.out.println("gía trị của n là "+ n); }
    public static void main (String[] args){
       vd3 bienlocal = new vd3();
        bienlocal.sayhello();
    }
}
/*
1. Biến local trong java
Biến local được khai báo trong các phương thức, hàm contructor hoặc trong các block.
Biến local được tạo bên trong các phương thức, contructor, block và sẽ bị phá hủy khi kết thúc các phương thức, contructor và block.
Không được sử dụng "access modifier" khi khai báo biến local.
Các biến local được lưu trên vùng nhớ stack của bộ nhớ.
Bạn cần khởi tạo giá trị mặc định cho biến local trước khi có thể sử dụng.
 */