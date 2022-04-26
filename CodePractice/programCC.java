import java.util.Scanner;

public class programCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            int arr[] = new int[10];

            for (int j = 0; j < 6; j++) {
                arr[j] = sc.nextInt();
            }
            if (arr[0] == arr[2] && arr[1] == arr[3] || arr[0] == arr[3] && arr[1] == arr[2])
                a[i] = 1;
            else if (arr[0] == arr[4] && arr[1] == arr[5] || arr[1] == arr[4] && arr[0] == arr[5])
                a[i] = 2;
            else
                a[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
