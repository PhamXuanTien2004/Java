import java.util.Scanner;

public class TongSoChan
{
    public static void main(String[] args) {
        int n;
        int s=0;
        System.out.print("So phan tu cua mang la: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Phan tu thu " +i+" cua mang la: ");
            A[i]=sc.nextInt();
            if(A[i]%2==0)
            {
                s+=A[i];
            }
        }
        System.out.print("Tong cac so chan co trong mang la: "+s);
        sc.close();

    }
}