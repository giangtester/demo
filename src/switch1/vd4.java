package switch1;
enum gioitinh { nam,nu,khac };
public class vd4 {
    public static void main(String[]args) {
        gioitinh gt =gioitinh.nam;
        String ketqua;
        switch (gt){
            case nam: ketqua ="xin chào anh"; break;
            case nu: ketqua= "xin chào chị"; break;
            default: ketqua="xin chào anh chị"; break;
        }
        System.out.println(ketqua);
    }
}
