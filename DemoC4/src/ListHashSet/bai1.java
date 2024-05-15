package ListHashSet;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class bai1 {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        if (linkedHashSet.contains(s)) {
            linkedHashSet.remove(s);
            System.out.println("Xoa thanh cong");
            System.out.println("LinkedHashSet moi la: ");
            for (String i : linkedHashSet) {
                System.out.println(i);
            }
        } else {
            System.out.println("Phan tu " + s + " khong co.");
            System.out.println("LinkedHashSet la: ");
            for (String i : linkedHashSet) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
