import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        chuoi = sc.nextLine();

        System.out.print("Nhap ky tu: ");
        kytu = sc.next().charAt(0);

        int s = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (kytu == chuoi.charAt(i)) {
                s++;
            }
        }

        System.out.println("So lan xuat hien cua ky tu '" + kytu + "' trong chuoi la: " + s);
        sc.close();
    }
}
