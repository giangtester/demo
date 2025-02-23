public class Test {
    public static void main(String[] args) {
        int a = 100;
        int b = 3;

        String s = (a % b == 0) ? "a chia het cho b" : "a khong chia het cho b";
        String nuocsoi = (a == 100) ? "nước sôi" : (a>0) ? "nước ấm": "nước lạnh";
        System.out.println(nuocsoi);
        System.out.println(s);
    }
}