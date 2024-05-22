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
        System.out.println("Que quan: ");
        que=sc.nextLine();

        System.out.println("Tuoi: ");
        tuoi=sc.nextInt();
        
        sc.close();
    }
    public void xuat()
    {
        System.out.println("Thong tin cua Person");
        System.out.println("Ten la "+ten);
        System.out.println("Tuoi "+tuoi);
        System.out.println("Que quan "+que);
    }
    public void sua(int n)
    {
        
    }
    public static void main(String[] args) {
        PXT418_Person Person= new PXT418_Person();
        ArrayList <PXT418_Person> arrlist[];
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so phan tu muon them: ");
        n=sc.nextInt();
        // them phan tu 
        for(int i=0;i<n;i++)
        {
            PXT418_Person a= new PXT418_Person();
            a[i].nhap();
            arrlist.add(a[i]);
            
            
        }       
        //sua

        // xoa
        int xoa;
        System.out.println("Nhap phan tu thu: ");
        xoa=sc.nextInt();
        arrlist.remove(xoa);
        //hien thi
        for(int i=0;i<n;i++)
        {
            arrlist.get(i);
        }
        
        

    }
}

