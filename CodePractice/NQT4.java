import java.util.Scanner;

public class NQT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for (int i = n - 1; i > 0;i--) {
            if (str.charAt(i) == ')') {
                for (int j = n-2; j > 0; j--) {
                    if(str.charAt(j)=='(') {
                        System.out.println("No Error!");
                    }else{
                        System.out.println("Error!");
                    }
                }
                break;
            } else {
                System.out.println("Error 2");

            }

        }
        sc.close();
    }

}
