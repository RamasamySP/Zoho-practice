import java.util.*;
class q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int tem = n-i+1;
			for (int q = 0; q < i; q++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(tem-- + " ");
			}
			System.out.println();
		}
	}
}