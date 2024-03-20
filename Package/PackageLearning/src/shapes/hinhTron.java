package shapes;

import java.util.Scanner;

public class hinhTron {
    final float pi=3.14f;
    float r;
    float cv;
    float dt;
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ban kinh la: ");
        r=sc.nextFloat();
        sc.close();
    }
    public void in()
    {
        cv=2*r*pi;
        dt=r*r*pi;
        System.out.println("Chu vi la: "+cv);
        System.out.println("Dien tich la: "+dt);
    }
    public static void main(String[] args) {
        hinhTron ht= new hinhTron();
        ht.nhap();
        ht.in();
    }    
}
