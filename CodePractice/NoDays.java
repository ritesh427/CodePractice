import java.util.Scanner;

public class NoDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int h=0,holidays=0;
        int arr2[] = {6,7,13,14,20,21,27,28};
        for (int i = 0; i < t; i++) {
            int as= sc.nextInt();
            int arr[] = new int[as];
            for (int j = 0; j < as; j++) {
                arr[j]=sc.nextInt();
                for (int j2 = 0; j2 <arr2.length; j2++) {
                     holidays = arr2.length+arr.length;
                     if(arr2[j2]==arr[j])
                     h++;
                }
            }
            System.out.println(holidays-h);
            h=0;
        }
        sc.close();
    }
}
