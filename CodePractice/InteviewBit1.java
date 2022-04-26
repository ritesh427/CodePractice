import java.lang.*;
import java.util.*;

public class InteviewBit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        
        }
        for(int j=t-1;j>=0;j--){

            System.out.println(arr[j]);
        }
        
    }
}