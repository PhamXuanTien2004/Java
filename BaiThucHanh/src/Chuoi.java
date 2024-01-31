import java.util.Scanner;

public class Chuoi {
    public static void main(String[] args) {
        String s;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Chuoi la: ");
        s=sc.nextLine();
        System.out.println("cac ky tu o chuoi la: ");
        for(int i=0;i<s.length();i++)
        System.out.println(s.charAt(i));
        sc.close();

    }
    
}
