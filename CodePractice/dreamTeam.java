import java.util.Random;
import java.util.Scanner;

public class dreamTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String team[]=new String [22];        
        System.out.println("################ Let's Win Today ###############");
        System.out.println("----------->Enter team One playing 11<------------");
        for (int i = 0; i < 22; i++) {
            team[i]=sc.nextLine();
            if(i==10)
            System.out.println("----------->Enter team Two playing 11<------------");
        } 
        System.out.println("**********Dream Team!!*********");
        for (int i = 0; i < team.length; i++) {
            int rn = new Random().nextInt(team.length);
            System.out.println((i+1)+" -> "+team[rn]);
            if(i==10)
            System.out.println("Backup Players");
        }
        System.out.println("**********Dream Team!!*********");
        sc.close();
    }
}
