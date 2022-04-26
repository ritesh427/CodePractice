import java.util.Scanner;
public class CRED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int X = sc.nextInt();
           String s = Integer.toString(X);
           for (int j = i+2; j < s.length(); j++) {
                System.out.print(s.charAt(j) + "J");
           }
           System.out.print(s.charAt(i)+ "N"); 
        }
        sc.close();
    }
}