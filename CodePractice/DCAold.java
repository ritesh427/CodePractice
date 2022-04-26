import java.util.Scanner;

public class DCAold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int c=0,k=0;
        int arr[]= new int[i];
        for (int j = 0; j < i; j++) {
            arr[j]=sc.nextInt();
        }
        c=arr[0];
        System.out.println(arr[0]);
        for (int j = 0; j < i; j++) {
            if(arr[j]!=c){
             k = c;
             break;
            }else{
                c++;
            }
        }
        System.out.println(k);
        sc.close();
    }
}
