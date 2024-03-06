import java.util.Scanner;

public class Employee
{

    int id;
    int year;
    String name;
    
    
    public void nhapThongTin()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ten: ");
        name=sc.nextLine();
        System.out.print("Ma so nhan vien: ");
        id=sc.nextInt();
        System.out.print("Nam sinh: ");
        year=sc.nextInt();
        
        
    }
    public void inThongTin()
    {
        System.out.println("Thong tin nhan vien");
        System.out.println("Ten: "+name);
        System.out.println("Ma so nhan vien: "+id);
        System.out.println("Tuoi: "+(2024-year));
        
    }
    public static void main(String[] args) {
        Employee st=new Employee();
        st.nhapThongTin();
        st.inThongTin();
    }
}