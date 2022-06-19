import java.util.*;
class q5 {
	public static void main(String args[]) {
		int arr1[] = {3,6,9};
		int arr2[] = {8,7,5};
		int arr3[] = new int[arr1.length+arr2.length];
		int a = arr1[0] < arr1[arr1.length-1] ? 0 : arr1.length-1;
		int b = arr2[0] < arr2[arr2.length-1] ? 0 : arr2.length-1;
		int temz = 0, tema = 0, temb = 0;
		for (int z = 0; ;z++) {
			temz = z;
			tema = a;
			temb = b;
			if (arr1[a] < arr2[b] ) {
				arr3[z] = arr1[a];
				if (arr1[0] < arr1[arr1.length-1]) {
					if (a < arr1.length) {
						a++;
					}
					else {
						break;
					}
				} else {
					if (a > 0)
						a--;
					else
						break;
				}
			} else {
				arr3[z] = arr2[b];
				if (arr2[0] < arr2[arr2.length-1]) {
					if (b < arr2.length)
						b++;
					else 
						break;
				} else {
					if (b > 0)
						b--;
					 else 
					 	break;
				}
			}
		}
		int ind = 0;
		if ((arr1[0] < arr1[arr1.length-1] && tema == arr1.length-1) || (arr1[0] > arr1[arr1.length-1] && tema == 0)){
			System.out.print(temz + " " + arr2[temb]);
			while (true) {
				arr3[temz] = arr2[temb];
				if (arr2[0] < arr2[arr2.length-1]) {
					if (temb < arr2.length)
						temb++;
					else 
						break;
				} else {
					if (temb > 0)
						temb--;
					 else 
					 	break;
				}
			}

		} else {
			System.out.print("in");
			while (true) {
				arr3[temz] = arr1[tema];
				if (arr1[0] < arr1[arr1.length-1]) {
					if (tema < arr1.length)
						tema++;
					else 
						break;
				} else {
					if (tema > 0)
						tema--;
					 else 
					 	break;
				}
			}
		}
		System.out.println(Arrays.toString(arr3));
	}

	static int inc (int a, int arr[]) {
		if (a < arr.length) {
			return a++;
		}
		return a;
	}
}