import java.util.*;
class q2 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int tem = 1;
for (int i = 1; i <= n; i++) {
	int temp = i;
	for (int j = 1; j <= n; j++) {
		
		if (temp <= n) {
			System.out.print(temp + " ");
			temp++;
		} else {
		System.out.print(tem + " ");
		tem++;
	      }
	}
	System.out.println();
	tem = 1;
}
}
}