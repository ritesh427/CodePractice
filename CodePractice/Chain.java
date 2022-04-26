import java.util.Scanner;

public class Chain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int c = 0;
            String owner = sc.nextLine();
            String chain = sc.next();
            if (chain == "Y") {
                String child = sc.nextLine();
                for (int i = 0; i < child.length(); i++) {
                    if (child.charAt(i) == ' ') {
                        c++;
                    }
                }
            }
            if(chain=="N") {
            System.out.println("Total Members: 1");
            System.out.println("Commission Details");
            System.out.println(owner +": 250 INR");
            } else {
                System.out.println("Please enter y or n");
            }
        }
        sc.close();
    }
}
