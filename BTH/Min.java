import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a=sc.nextInt();
        System.out.print("Nhap so b: ");
        b=sc.nextInt();
        if(a<=b)
        System.out.print("So nho nhat la: "+a);
        else System.out.print("So nho nhat la: "+b);
        sc.close();
    }
}
