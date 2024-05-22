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
    }
    public void xuat()
    {
        System.out.println("Thong tin cua Person");
        System.out.println("Ten la "+ten);
        System.out.println("Tuoi "+tuoi);
        System.out.println("Que quan "+que);
    }
    
}
