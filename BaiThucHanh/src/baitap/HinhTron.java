import java.util.Scanner;

public class HinhTron {

    float banKinh;
    final float pi=3.14f;
    float chuVi;
    float dienTich;

    public void nhapBanKinh()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ban kinh la: ");
        banKinh=sc.nextInt();
    }
    public void tinhChuVi()
    {
        chuVi=2*banKinh*pi;
    }
    public void tinhDienTich()
    {
        dienTich=pi*banKinh*banKinh;
    }
    public void inThongTin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Chu vi la: "+chuVi);
        System.out.println("Dien tich la: "+ dienTich);
    }
    public static void main(String[] args) {
        HinhTron ht=new HinhTron();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inThongTin();

    }
}