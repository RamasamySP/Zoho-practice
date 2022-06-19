import java.util.*;
class q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int tem = i;
			for (int j = 0; j <= i; j++) {
				System.out.print(tem-- +  " ");
			}
			tem += 2;
			for (int k = i+1; k < n; k++) {
				System.out.print(tem++ + " ");
			}
			System.out.println();
		}
	}
}