import java.util.Scanner;

public class chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int c=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(c>x){
                arr[i] = (c-x)*y;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}
