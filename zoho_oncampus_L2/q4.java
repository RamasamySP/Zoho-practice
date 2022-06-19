import java.util.*;
class q4 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int a = 0; a < n; a++) {
		arr[a] = sc.nextInt();
	}
int count = 0;
	for (int i = 0; i < n-1; i++) {
		int min = 0;
		for (int j = i+1; j < n; j++) {
			if (arr[j]	> arr[i]) {
				if (count == 0){
					min = arr[j];
					count++;
				}
				if (count > 0) {
				min = arr[j] < min ? arr[j] : min;
				}
			}
		}
		if (min > arr[i] && min != 0) {
			arr[i] = min;
		} else {
			arr[i] = -1;
		}
	}
arr[arr.length -1] = -1;
for (int q = 0; q < n; q++) {
System.out.print(arr[q] + " ");
}

}
}