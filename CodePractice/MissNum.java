import java.util.Scanner;
import java.util.Arrays;

public class MissNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int arr[] = new int[4];
            for (int j = 0; j < 4; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr, 0, 4);
            int a1 = (arr[2] + arr[0]) / 2;
            int a2 = (arr[2] + arr[1]) / 2;
            int a3 = (arr[3] + arr[0]) / 2;
            int a4 = (arr[3] + arr[1]) / 2;
            int b1 = arr[2] - a1;
            int b2 = arr[2] - a2;
            int b3 = arr[3] - a3;
            int b4 = arr[3] - a4;

            if ((a1 % 1 == 0) && (a1 != 0) && (b1 % 1 == 0) && (b1 != 0))
                if ((a1 / b1 == arr[1]) && (a1 * b1 == arr[3]) && (a1 >= 1) && (b1 >= 1) && (a1 <= 10000)
                        && (b1 <= 10000)) {
                    System.out.println(a1 + " " + b1);
                    continue;
                }

            if ((a2 % 1 == 0) && (a2 != 0) && (b2 % 1 == 0) && (b2 != 0))
                if ((a2 / b2 == arr[0]) && (a2 * b2 == arr[3]) && (a2 >= 1) && (b2 >= 1) && (a2 <= 10000)
                        && (b2 <= 10000)) {
                    System.out.println(a2 + " " + b2);
                    continue;
                }
            if ((a3 % 1 == 0) && (a3 != 0) && (b3 % 1 == 0) && (b3 != 0))
                if ((a3 / b3 == arr[1]) && (a3 * b3 == arr[2]) && (a3 >= 1) && (b3 >= 1) && (a3 <= 10000)
                        && (b3 <= 10000)) {
                    System.out.println(a3 + " " + b3);
                    continue;
                }
            if ((a4 % 1 == 0) && (a4 != 0) && (b4 % 1 == 0) && (b4 != 0))
                if ((a4 / b4 == arr[0]) && (a4 * b4 == arr[2]) && (a4 >= 1) && (b4 >= 1) && (a4 <= 10000)
                        && (b4 <= 10000)) {
                    System.out.println(a4 + " " + b4);
                    continue;
                }
            System.out.println(-1 + " " + -1);

        }
        sc.close();
    }
}
