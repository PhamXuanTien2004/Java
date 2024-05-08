package Lists;



import java.util.Scanner;

/**
 * Student
 */
public class Student {

    int id;
    int age;
    String name;
    String que;
    
    public void nhapThongTin()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ten: ");
        name=sc.nextLine();
        System.out.print("Ma so sinh vien: ");
        id=sc.nextInt();
        System.out.print("Tuoi: ");
        sc.nextLine();
        age=sc.nextInt();
        System.out.print("Que quan: ");
        sc.nextLine();
        que=sc.nextLine();
        sc.close();
        
    }
    public void inThongTin()
    {
        System.out.println("Thong tin sinh vien");
        System.out.println("Ten: "+name);
        System.out.println("Ma so sinh vien: "+id);
        System.out.println("Tuoi: "+age);
        System.out.println("Que quan: "+que);
    }
    public static void main(String[] args) {
        Student st=new Student();
        st.nhapThongTin();
        st.inThongTin();
    }
}

