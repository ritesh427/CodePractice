import java.util.Scanner;

public class ChefDiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        boolean f = false;
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt()+a;
                if(arr[j]>=K){
                    a = arr[j]-K;
                    f = true;
                }else
                    a = K-arr[j];
                    f = false;
            }
            if(true)
            System.out.println("YES");
        }
        sc.close();
    }
}
