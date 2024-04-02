package KeThua;
import java.util.Scanner;

public class Person {
    static Scanner sc = new Scanner(System.in);
    private String ten;
    private int tuoi;
    private String diaChi;
    public Person() {
    }
    public Person(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }
    public void input() {
        System.out.println("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.tuoi = sc.nextInt();
        System.out.println("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }
    public void output(){
        System.out.println("Ho ten: " + this.ten);
        System.out.println("Tuoi: " + this.tuoi);
        System.out.println("Dia chi: " + this.diaChi);
    }
}
