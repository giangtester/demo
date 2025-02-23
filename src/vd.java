public class vd {

    public void sayHello() {
        int n=1;                 // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        vd bienLocal = new vd();
        bienLocal.sayHello();
    }
}