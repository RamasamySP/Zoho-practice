import java.util.*;
class nq1 {
    public static void main(String[] args) {
        int z = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tem = 0;
        int arr[][] = new int[n][(2*n)-1];
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                tem = z+n-1;
                z = z+n;
            }
//            for (int q = 0; q < n-i-1; q++) {
//                System.out.print("   ");
//            }
            for (int j = n-i; j <= (2*n-1)-i; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = z++;
                } else {
                    arr[i][j] = tem--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}