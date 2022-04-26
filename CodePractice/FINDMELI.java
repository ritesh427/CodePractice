import java.util.Scanner;

public class FINDMELI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = 0;
        for (int i = 0; i < n; i++) {
            int arr[] = new int[n];
            arr[i] = sc.nextInt();
            if (arr[i] == k) {
                r = 1;
                break;
            } else
                r = -1;
        }
        System.out.println(r);
        sc.close();
    }

}
