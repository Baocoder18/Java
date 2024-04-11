package LopLongNhau;

class Outter{
    int m = 3, n = 2;
    Inner in_obj = new Inner();
    Outter(){
        System.out.println(m + ", " + n + ", k = " + in_obj.k);
    }
    class Inner{
        int k = 3;
        Inner(){
            System.out.println("Inner access Outter m = " + m + ", n = " + n);
        }
    }
}
public class TestInnerOutter {
    public static void main(String[] args) {
        Outter obj = new Outter();
    }
}
