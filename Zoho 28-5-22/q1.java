import java.util.*;
class q1 {
    public static void main(String[] args) {
        int arr[][] = {{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}};
        //int arr[][] = {{1, 100}, {7, 100}, {1, 100}, {7, 100}, {1, 100}, {7, 100}, {1, 100}, {7, 100}, {1, 100}, {7, 100}};
        int stu1[] = new int[arr.length];
        int stu2[] = new int[arr.length];
        int stu1id = arr[0][0], stu2id = 0; // storing First student id and comparing to avoid cases like student id = 7
        int index1 = 0, index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == stu1id) {
                stu1[index1] = arr[i][1];
                index1++;
            } else {
                stu2id = arr[i][0];
                stu2[index2] = arr[i][1];
                index2++;
            }
        }
        Arrays.sort(stu1);
        Arrays.sort(stu2);
        int output[][] = new int[2][2];
        output[0][0] = stu1id;
        output[0][1] = average(stu1);
        output[1][0] = stu2id;
        output[1][1] = average(stu2);
        //printing output array
        for (int q = 0; q < 2; q++) {
            for (int w = 0; w < 2; w++) {
                System.out.print(output[q][w] + " ");
            }
            System.out.println();
        }
    }

    static int average(int arr[]) {
        int score = 0;
        for (int a = arr.length -1, count = 0; a >= 0 && count < 5; a--) {
            score += arr[a];
            count++;
        }
        return score/5;
    }
}