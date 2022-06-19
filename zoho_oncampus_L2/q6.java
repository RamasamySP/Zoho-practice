import java.util.*;
class q6 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String arr[] = new String[n];
sc.nextLine();
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextLine();
	}
	Arrays.sort(arr);
	for (int j = 0; j < n; j++) {
		System.out.print(arr[j] + " ");
	}
}
}