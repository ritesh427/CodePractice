import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {    
            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr[] =  new int[a];
            for (int j = 0; j < a; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(solve(arr,b));  
    }
}
    static String solve(int[] arr, int b){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=b) {
                res.append('1');
                b-=arr[i];
            }else{
                res.append('0');
            }
        }
        return res.toString();
    }

}
