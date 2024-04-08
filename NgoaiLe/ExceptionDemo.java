package NgoaiLe;

import java.util.Scanner;

public class ExceptionDemo {
    public static void ps (int a, int b) throws ArithmeticException{
        if(b==0)
        throw new ArithmeticException();
        else System.out.println("Ket qua: " + (double)a/b);
    }
    public static void main(String[] args) {
        int tuso, mauso;
        System.out.println("Chuong trinh tinh phan so: ");
        Scanner ca = new Scanner(System.in);
        System.out.println("Tu so: ");
        tuso = ca.nextInt();
        System.out.println("Mau so: ");
        mauso = ca.nextInt();
        try {
            ps(tuso, mauso);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.toString());
        }
        System.out.println("Chay den day");
        ca.close();
    }
}
