import java.util.*;
class q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = 3;
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		int tem = n%k;
		for (int i = 0; i < n; i = i+k) {
			int t = i;
			int p = i+k-1;
			int j = p < arr.length ? p : arr.length-1 ;
			while (t < j) {
				int temp = arr[t];
				arr[t] = arr[j];
				arr[j] = temp;
				t++;
				j--;
			}
		}
		for (int q = 0; q < n; q++) {
			System.out.print(arr[q] + " ");
		}
	}
}