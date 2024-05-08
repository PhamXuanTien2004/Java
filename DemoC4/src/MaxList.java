import java.util.ArrayList;
import java.util.Scanner;

public class MaxList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arrayList= new ArrayList<Integer>(10);
        for(int i=0;i<10;i++)
        {
            int a=sc.nextInt();
            arrayList.add(a);
            
        }
        int max=arrayList.get(0);
        for(int i=1;i<10;i++)
        {
            if(max<arrayList.get(i))
            max=arrayList.get(i);
        }
        System.out.println("So lon nhat trong day la: "+max);
        sc.close();
    }
}
