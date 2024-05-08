import java.util.ArrayList;
import java.util.Scanner;

public class demoC4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList= new ArrayList<>(5);
        for(int i=0;i<arrList.size();i++)
        {
            System.out.println("Nhap phan tu thu "+i+" la: ");
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            arrList.add(i,a);
        }

    }
}
