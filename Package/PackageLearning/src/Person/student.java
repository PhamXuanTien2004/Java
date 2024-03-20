package Person;

import java.util.Scanner;

public class student {
    String name;
    int age;
    int id;
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ho va ten: ");
        name=sc.nextLine();
        
        System.out.println("Tuoi: ");
        age=sc.nextInt();
        System.out.println("MSV: ");
        id= sc.nextInt();
        sc.close();
    }
    public student()
    {
        name="Diep";
        age= 44;
        id=1978;
    }
    public void in()
    {
        System.out.println("THONG TIN SINH VIEN ");
        System.out.println("Ho va ten: "+ name);
        System.out.println("Tuoi: "+ age);
        System.out.println("MSV: "+id);
    }
    public void in (String name,int age)
    {
        System.out.println("THONG TIN SINH VIEN ");
        System.out.println("Ho va ten: "+ name);
        System.out.println("Tuoi: "+ age);
        
    }
    
}
