import java.util.Scanner;

public class Pt1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.print("Nhap gia tri a: ");
        a=sc.nextInt();
        System.out.print("Nhap gia tri b: ");
        b=sc.nextInt();
        
        if(a==0)
        System.out.print("Vo nghiem");
        else
        {
            System.out.println("Nghiem la: "+(-b/a));
        }
        sc.close();
    }
}
