package LopLongNhau;

public class TestOutter1 {
    static int data = 30;
    static class Inner{
        void msg(){
            System.out.println("Data is " + data);
        }
    }
    public static void main(String[] args) {
        TestOutter1.Inner obj = new TestOutter1.Inner();
        obj.msg(); 
    }
}
