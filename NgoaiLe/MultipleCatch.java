package NgoaiLe;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[9] = 4 / 0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Loi vuot khoi chi so mang da duoc xu ly");
        } catch (ArithmeticException e) {
            System.out.println("Loi chia 0 da duoc xu ly");
        }
        System.out.println("Phan con lai cua chuong trinh");
    }
}
