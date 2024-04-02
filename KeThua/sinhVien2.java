package KeThua;
import java.util.Scanner;

public class sinhVien2 {
    private String maSV;
    private String hoVaTen;
    private double diemTB;

    public sinhVien2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma SV: ");
        this.maSV = sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        this.hoVaTen = sc.nextLine();
        System.out.println("Nhap diem TB: ");
        this.diemTB = sc.nextDouble();
        sc.close();
    }
    public void print(){
        System.out.println("MaSV: " + this.maSV + " - " + "Ho va ten: " + this.hoVaTen + " - " + "Diem TB: " + this.diemTB);
    }
    public static void main(String[] args) {
        sinhVien2 sv = new sinhVien2();
        sv.print();
    }
}
