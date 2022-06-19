import java.util.*;
class q3 {
    public static void main(String[] args) {
        int arr[][] = {{7, 10}, {2, 4}, {4, 8}};
        boolean available[] = new boolean[24];
        boolean res = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] >23 || arr[i][1] > 23) {
                // I am taking the values in test case as [hours, hours] in 24 hr format and marking in boolean array if that time period is available or not, hence negkecting > 23
                res = false;
                break;
            }
            for (int j = arr[i][0]; j < arr[i][1]; j++) {
                if (available[j] == false) {
                    available[j] = true;
                } else {
                    res = false;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}