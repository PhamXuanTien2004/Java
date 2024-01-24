import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int year;
        String name;
        Scanner sc=new Scanner (System.in);
        System.out.print("Ten la: ");        
        name=sc.nextLine();
        System.out.print("Nam sinh: ");
        year= sc.nextInt();
        if(2024-year<16)
        System.out.print("Ban "+ name +" o do tuoi vi thanh vien.");
        else if(2024-year>=16 && 2024-year<18)
        System.out.print("Ban "+ name +" o do tuoi truong thanh.");
        else System.out.print("Ban "+ name +" da gia.");
        sc.close();
    }
}
