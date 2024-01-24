import java.util.Scanner;

public class Pt2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.print("Nhap gia tri a: ");
        a=sc.nextInt();
        System.out.print("Nhap gia tri b: ");
        b=sc.nextInt();
        System.out.print("Nhap gia tri c: ");
        c=sc.nextInt();
        if(a==0)
        System.out.print("Nghiem la: "+(-c/b));
        else
        {
            double denta=Math.pow(b, 2)-4*c*a;
            if(denta ==0)
            System.out.print("Nghiem kep la: "+(-b/(2*a)));
            else if(denta <0)
            {
                System.out.println("Nghiem 1 la: "+((-b+Math.sqrt(denta))/(2*a)));
                System.out.println("Nghiem 2 la: "+((-b-Math.sqrt(denta))/(2*a)));
            }
            else 
            {
                System.out.println("Vo nghiem");
            }
        }
      sc.close();  
    }
}
