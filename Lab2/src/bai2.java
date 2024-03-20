import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so nguyen: ");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        if(n%2==0)
        System.out.print( n+" la so chan.");
        else System.out.print( n+" la so le.");
        sc.close();
    }
}
