package NgoaiLe;

public class ThrowTest {
    static void validate(int age){
        try {
            if(age < 0 )
                throw new ArithmeticException("Tuoi khong hop le");
            else System.out.println("Tuoi hop le");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        validate(-2);
        System.out.println("Phan con lai cua chuong trinh");
    }
}
