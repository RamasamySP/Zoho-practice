import java.util.*;
class q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char tem = s.charAt(i);
			if (tem != 'a' && tem != 'e' && tem != 'i' && tem != 'o' && tem != 'u' && tem != 'A' && tem != 'E' && tem != 'I' && tem != 'O' && tem != 'U') {
				res = res.concat("#");
				String a = s.substring(i , i+1);
				if ((s.charAt(i) > 64) && (s.charAt(i) < 91)) 
					res = res.concat(a.toLowerCase());
				if ((s.charAt(i) > 96) && (s.charAt(i) < 123)) 
					res = res.concat(a.toUpperCase());
			}
		}
		System.out.println(res);
	}
}