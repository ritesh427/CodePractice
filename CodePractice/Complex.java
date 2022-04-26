import java.util.Arrays;
import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a=0;


        //System.out.println(n*(n+1)/2); //


        for (int i = 0; i < n; i++) {
            a=a+1;   //log n 
            System.out.println(a);
        }

        // for (int i = 0; i < n; i++) {              2n+c
        //     for (int j = 0; j < i; j++){        
        //     a=a+1;   
        //     }
        // }

        Arrays
        
        sc.close();
    }
}
