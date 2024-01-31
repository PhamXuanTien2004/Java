import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        int n;

        System.out.print("So phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + i + " la: ");
            A[i] = sc.nextInt();
        }

        int B[] = new int[n];
        // Copy mảng A sang mảng B
        for (int i = 0; i < n; i++) {
            B[i] = A[i];
        }

        // Sắp xếp mảng B
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (B[i] > B[j]) {
                    int tmp = B[i];
                    B[i] = B[j];
                    B[j] = tmp;
                }
            }
        }

        System.out.println("Mang ban dau la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nMang sau xep sap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }

        sc.close();
    }
}
