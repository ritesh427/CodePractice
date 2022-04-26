import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int rev;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            rev = (a%10);
            a=a/10;
            rev = rev + rev*10;
            System.out.println(rev);
        }
        sc.close();
    }
    
}
