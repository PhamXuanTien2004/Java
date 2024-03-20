import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int s=1,n;
        System.out.print("Nhap so nguyen: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        s*=i;
        System.out.print("Luy thua cua "+n+" la: "+s);
        sc.close();
    }
}
