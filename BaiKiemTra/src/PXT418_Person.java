import java.util.ArrayList;
import java.util.Scanner;


public class PXT418_Person {
    public int tuoi;
    public String ten;
    public String que;
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten=sc.nextLine();
        System.out.println("Tuoi: ");
        tuoi=sc.nextInt();
        System.out.println("Que quan: ");
        que=sc.nextLine();
        sc.close();
    }
    public void xuat()
    {
        System.out.println("Thong tin cua Person");
        System.out.println("Ten la "+ten);
        System.out.println("Tuoi "+tuoi);
        System.out.println("Que quan "+que);
    }

    public static void main(String[] args) {
        PXT418_Person Person;
        ArrayList<PXT418_Person>arrlist= new ArrayList<>();
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        n=sc.nextInt();
        // them phan tu 
        arrlist.add(Person);
        // xoa phan tu
        arrlist.remove(Person);
        //sua
        //hien thi
        for(int i=0;i<n;i++)
        {
            arrlist.get(i);
        }
        
        

    }
}
