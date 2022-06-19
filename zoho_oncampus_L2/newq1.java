import java.util.*;
class newq1 {
    public static void main(String[] args) {
        int z = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tem = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                tem = z+n-1;
                z = z+n;
            }
            for (int q = 0; q < n-i-1; q++) {
                System.out.print("   ");
            }
            for (int j = n-i; j <= (2*n-1)-i; j++) {
                if (i % 2 == 0) {
                    System.out.print(z++ + " ");
                } else {
                    System.out.print(tem-- + " ");
                }
            }
            System.out.println();
        }
    }
}
