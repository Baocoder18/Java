package NgoaiLe;

class ChiaCho0Exception extends Exception{
    ChiaCho0Exception(String msg){
        super(msg);
    }
}
public class ChiaChoKhong {
    public void chia() throws ChiaCho0Exception{
        int n1 = 20;
        int n2 = 0;
        if(n2==0) throw new ChiaCho0Exception("/ by 0");
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.println("Ket thuc ham chia");
    }
    public static void main(String[] args) {
        ChiaChoKhong ch = new ChiaChoKhong();
        try {
            ch.chia();
        } catch (ChiaCho0Exception e) {
            System.out.println("Trong main() gap loi: " + e);
        }finally{
            System.out.println("Nhung viec can thuc hien");
        }
        System.out.println("Quay lai ham main");
    }
}
