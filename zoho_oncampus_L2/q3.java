import java.util.*;
class q3 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int a = ((int)str.charAt(0)) - 48;
	for (int i = 1, j = (str.length()/2) + 1; j < str.length(); i++, j++) {
		int b = ((int)str.charAt(i)) - 48;
		if (str.charAt(j) == '+') {
			b += a;
		}
		if (str.charAt(j) == '-') {
			int t = a-b;
			b = t;
		}
		if (str.charAt(j) == '*') {
			b *= a;
		}
		if (str.charAt(j) == '/') {
			int tem = a/b;
			b = tem;
		}
		a = b;
	}
	System.out.println(a);
}
}