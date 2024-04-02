package KeThua;
import java.util.Scanner;

public class NhanVien3 {
    static Scanner sc=new Scanner(System.in);
    private String hoTen;
    private String diaChi;
    private String tuoi;
    private String luong;

    public void Nhap() {
        System.out.println("Nhap ten: ");
        this.hoTen=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi=sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.tuoi=sc.nextLine();
        System.out.println("Nhap luong: ");
        this.luong=sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ho va ten: "+ hoTen+", Dia chi: "+diaChi+",Tuoi :" +tuoi+", Luong la: "+luong);
        }
    public static void main(String[] args) {
        int n=Integer.parseInt(sc.nextLine());
        NhanVien3 nV3[]= new NhanVien3[n];
        for (int i=0;i<n;i++) {
            nV3[i] = new NhanVien3();
            nV3[i].Nhap();
        }
        for (int i=0;i<n;i++) {
            nV3[i].Xuat();
        }
    }
}