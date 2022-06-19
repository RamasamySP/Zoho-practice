import java.util.*;
class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        s = s.toLowerCase();
        t = t.toLowerCase();
        if (s.length() == t.length()) {
            System.out.println(anagram(s, t));
        } else {
            System.out.println("false");
        }
    }

    static boolean anagram(String s, String t) {
        char arr[] = new char[26];
        for (int a = 0; a < s.length(); a++) {
            arr[s.charAt(a) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (arr[t.charAt(i) - 97] >= 0) {
                arr[t.charAt(i) - 97]--;
            } else {
                return false;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                return false;
            }
        }
        return true;
    }
}