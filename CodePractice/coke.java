import java.util.Scanner;
public class coke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nm = sc.nextLine();
        System.out.println("Enter Price:");
        float price = sc.nextInt();
        int c=1;
        for (int i = 0; i < nm.length(); i++) {
        if(nm.charAt(i)==','){
            c++;
        }            
        }
        System.out.println("Main Price: "+price);
        System.out.println("Distributed Price: "+ price/c+" Each");
        sc.close();
    }
    
}
