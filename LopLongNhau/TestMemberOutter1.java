package LopLongNhau;

public class TestMemberOutter1 {
    private int data = 30;
    class Inner{
        void msg(){
            System.out.println("Data is " + data);
        }
    }
    public static void main(String[] args) {
        TestMemberOutter1 obj = new TestMemberOutter1();
        TestMemberOutter1.Inner in = obj.new Inner();
        in.msg();
    }
}
