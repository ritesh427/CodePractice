import java.util.Scanner;

public class FrwrdBcrd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newStr = "";
        String s = sc.nextLine();
        for (int i = 1; i < s.length(); i++) {
            char newString = s.charAt(i);
            newStr += newString;
        }
        newStr = newStr + "" + s.charAt(0);
        newStr = newStr.toString();
        // System.out.println(stringCompare(s,newStr));
        System.out.println(0);
        sc.close();
    }
}
