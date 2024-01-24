import java.util.Scanner;

public class Tong_cac_chu_so {
    public static void main(String[] args) {
        int n,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n=sc.nextInt();
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        System.out.println("Ket qua la: "+s);
        sc.close();        
    }
}
