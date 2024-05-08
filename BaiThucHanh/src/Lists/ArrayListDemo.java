package Lists;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Student> arrayListSt= new ArrayList<Student>(n);
        for(int i=0;i<n;i++)
        {
            Student st= new Student();
            st.nhapThongTin();
            arrayListSt.add(st);
        }
        for(int i=0;i<n;i++)
        {
            
            arrayListSt.get(i).inThongTin();
        }
        sc.close();
    }
}
