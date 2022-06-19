import java.util.*;
class q1 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int tem = n;
	for (int i = 1; i <= n; i++) {
	int t = i;
		for (int j = 1; j <= n; j++) {
			if (j >= tem) {
				System.out.print(t);
				t--;
			} else {
				System.out.print(" ");
			}
		}
	System.out.println();
	tem--;
	}
}
}