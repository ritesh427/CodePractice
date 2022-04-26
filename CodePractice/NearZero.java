import java.util.Arrays;
import java.util.Scanner;

public class NearZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[]=new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]>=0)
        System.out.println(arr[0]);
        else{
            for (int i = 0; i < a; i++) {
                if(arr[i]>0){
                System.out.println(arr[i]);
                break;
                }else if(arr[i]<0){
                System.out.println(arr[a-1]);
                break;
                }
            }
        }
    }

}
