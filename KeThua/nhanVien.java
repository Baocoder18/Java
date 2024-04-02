package KeThua;
public class nhanVien {
    private String hoTen;
    private String diaChi;
    private int tuoi;
    private double luong;

    public nhanVien(String ht, String dc, int t, double l){
        this.hoTen = ht;
        this.diaChi = dc;
        this.tuoi = t;
        this.luong = l;
    }
    public void display(){
        if(this.tuoi < 30 && this.luong > 500000){
            System.out.println(this.hoTen + "-" + this.diaChi + "-" + this.tuoi + "-" + this.luong);
        }
    }
    public static void main(String[] args) {
        nhanVien[] nhanvien = new nhanVien[10];
        nhanvien[0] = new nhanVien("Bao", "Hanoi", 20, 6000000);
        nhanvien[1] = new nhanVien("Anh", "Hanoi", 30, 400000);
        nhanvien[2] = new nhanVien("Hung", "Hanoi", 22, 700000);
        nhanvien[3] = new nhanVien("Tuan", "Hanoi", 25, 800000);
        for(int i=0; i<=3; i++){
            nhanvien[i].display();
        }
    }
}
