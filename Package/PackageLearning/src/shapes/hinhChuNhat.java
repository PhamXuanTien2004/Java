package shapes;

import java.util.Scanner;

public class hinhChuNhat {
    public float cd;
    public float cr;
    public float cv;
    public float dt;
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Chieu dai la: ");
        cd=sc.nextFloat();
        System.out.println("Chieu rong la: ");
        cr=sc.nextFloat();
    }
    public void in()
    {
        System.out.println("Chu vi la: "+(cd*2+cr*2));
        System.out.println("Dien tich la: "+(cd*cr));
    }
}
