package String;

public class PassStr {
    static void kiemTra_Str(String tsht){
        tsht = "Chuoi da cap nhat";
    }
    public static void main(String[] args) {
        String tst = new String("Chuoi ban dau");
        System.out.println("Gia tri cua tham so thuc, tst: ");
        System.out.println("\t>> Truoc khi ra loi goi kiemTra_Str: " + tst);
        kiemTra_Str(tst);
        System.out.println("\t>> Sau khi kiemTra_Str hoan thanh: " + tst);
    }
}
