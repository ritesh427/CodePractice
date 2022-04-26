import java.util.*;

public class Arraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Number of Elements in Array.");
        int n = sc.nextInt();
        System.out.println("Please Input elements.");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements are");
        for (int k = 0; k <= n; k++) {
            System.out.println("arr["+ k+"]="+ arr[k]);
        }
        // System.out.println("After Condition.");
        // for (int j = 0; j <n; j++) {
        //     if(j==0||j==1){
        //         System.out.println("arr["+j+"]=" + (arr[j]*0));
        //     }
        //     else if(j%2!=0){
        //         System.out.println("arr["+j+"]=" + (arr[j]-2));
        //     }
        //     else
        //     {
        //         System.out.println("arr["+j+"]=" + arr[j]);
        //     }
        // }
        sc.close();
    }
}
