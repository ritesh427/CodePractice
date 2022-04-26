import java.util.Scanner;
public class AVG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[T];
        int sum=0;
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int v = sc.nextInt();
            for(int j=0;j<n;j++){
                arr[i] = sc.nextInt();
                sum +=arr[i];
            }
            int s = (n+k)*v;
            int p = s-sum;
            p=p/k;
            if(p>0)
            System.out.println(p);
            else
            System.out.println(-1);
        }
    }
}
