package main;
import shapes.hinhChuNhat;
import shapes.hinhTron;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        hinhChuNhat hcn= new hinhChuNhat();
        hcn.nhap();
        hcn.in();
        hinhTron ht =new hinhTron();
        ht.nhap();
        ht.in();

    }
}
