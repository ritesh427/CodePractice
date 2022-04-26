import java.util.Scanner;

public class candyRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            for (int j = 1; j <= n; j++) {
                arr1[j - 1] = j;
            }
            for (int k = n * 2, l = 0; k > n; k--, l++) {
                arr2[l] = k;
            }
            for (int m = 0; m <= n; m++) {
                if (arr1[m] == x) {
                    System.out.println(arr2[m]);
                    break;
                }
                if (arr2[m] == x) {
                    System.out.println(arr1[m]);
                    break;
                }
            }
        }
        sc.close();
    }
}
