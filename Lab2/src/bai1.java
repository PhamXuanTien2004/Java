import java.util.Scanner;

public class bai1
{
    public static void main(String[] args) 
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a=sc.nextInt();
        System.out.print("Nhap so b: ");
        b=sc.nextInt();
        System.out.println("Tong hai so la: "+(a+b));
        System.out.println("Hieu hai so la: "+(a-b));
        System.out.println("Tich hai so la: "+(a*b));
        System.out.println("Thuong hai so la: "+(a/b));
        System.out.println("So du la: "+(a%b));
        if(a>b)
        System.out.println("a lon hon b. ");
        else if(a<b)
        System.out.println("b lon hon a ");
        else System.out.println("Hai so bang nhau. ");
        sc.close();
    }

}