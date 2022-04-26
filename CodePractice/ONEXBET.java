import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class ONEXBET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("##############################");
        System.out.println("Match Result : 1");
        System.out.println("Max run in Over : 2");
        System.out.println("Player Max run : 3");
        System.out.println("Check Even or Odd : 4");
        System.out.println("Check Toss Prediction : 5");
        System.out.println("Create Dream Team : 6");
        System.out.println("##############################");
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("Enter Team 1 Name!");
            String team1 = sc.next();
            System.out.println("Enter Team 2 Name!");
            String team2 = sc.next();
            System.out.println("!!!! Match B/W "+ team1 +" and "+team2+" !!!!");
            double w = Math.random() * 100;
            int win = (int) w;
            if (win > 50) {
                System.out.println(team1 + " will Win. Hurray!!");
            } else {
                System.out.println(team2 + " will Win. Hurray!!");
            }
        } else if (input == 2) {
            System.out.println("Which format? Press 1 for ODI, Press 2 for T20, Press 3 for Test.");
            int form = sc.nextInt();
            if (form == 1) {
                System.out.println("In ODI Match Which Over?");
                int ovr = sc.nextInt();
                if(ovr<50){
                double o = Math.random() * 100;
                int win = (int) o;
                if (win > 50) {
                    System.out.println("In " + ovr + " over more then 10 runs.");
                } else {
                    System.out.println("In " + ovr + " over less then 10 runs.");
                }
            }else{
                System.out.println("Please select 3 for Test Match Prediction.");
            }
            } else if (form == 2) {
                System.out.println("In T20 match Which Over?");
                int ovr = sc.nextInt();
                if(ovr<20){
                double o = Math.random() * 100;
                int win = (int) o;
                if (win > 50) {
                    System.out.println("In " + ovr + " more then 15 runs.");
                } else {
                    System.out.println("In " + ovr + " less then 15 runs.");
                }
            }else{
                System.out.println("Please select 1 for ODI or 3 for Test.");
            }
            } else if (form == 3) {
                System.out.println("In Test match Which Over?");
                int ovr = sc.nextInt();
                double o = Math.random() * 100;
                int win = (int) o;
                if (win > 50) {
                    System.out.println("In " + ovr + " more then 4 runs.");
                } else {
                    System.out.println("In " + ovr + " less then 4 runs.");
                }
            } else {
                System.out.println("Please select from 1,2,3");
            }
        } else if (input == 3){
            System.out.println("Enter Your Player Name!");
            String player = sc.next();
            double w = Math.random() * 100;
            int run = (int) w;
            if (run > 50) {
                System.out.println(player + " will Score more then 50");
            } else {
                System.out.println(player + " will Score less then 50");
            }
        } else if (input == 4){
            System.out.println("Enter Over Number!");
            String over = sc.next();
            double w = Math.random() * 100;
            int run = (int) w;
            if (run > 50) {
                System.out.println(over + " Over Even Runs");
            } else {
                System.out.println(over + " Over Odd Runs");
            }
        } else if (input == 5){
            System.out.println("Enter Team 1 Name!");
            String team1 = sc.next();
            System.out.println("Enter Team 2 Name!");
            String team2 = sc.next();
            double w = Math.random() * 100;
            int toss = (int) w;
            if (toss > 50) {
                System.out.println(team1 + " Will win toss.");
            } else {
                System.out.println(team2 + " Will win toss.");
            }
        } 
        else if (input == 6) {
            // Dream Team

        String team[]=new String [22];           
        String randTeam[]=new String [22]; 
        String temp;          
        System.out.println("################ Let's Win Today ###############");
        System.out.println("----------->Enter team One playing 11<------------");
        for (int i = 0; i <22; i++) {
            team[i]=sc.next();
            if(i==10) System.out.println("----------->Enter team Two playing 11<------------");
        } 


        // System.out.println("**********Dream Team!!*********");
        // for (int i = 0; i < team.length; i++) {
        //     int rn = new Random().nextInt(team.length);
        //     if(rn>0){
        //         randTeam[i]=team[rn];
        //     }else i--;
        // }

        // for(int i = 0; i < randTeam.length; i++ ) {
        //     for(int j = i+1; j < randTeam.length; j++) {
        //        if(randTeam[i].compareTo(randTeam[j])>0) {
        //            temp = randTeam[i];
        //            randTeam[i] = randTeam[j];
        //            randTeam[j] = (String)temp;
        //        }
        //     }
        //     System.out.println(i+1+"->"+randTeam[i]);
        // }


        System.out.println("**********Dream Team!!*********");

        System.out.println("**********Dream Team!!*********");
        for (int i = 0; i < team.length; i++) {
            int rn = new Random().nextInt(team.length);
            if(rn>0)
            System.out.println((i+1)+" -> "+team[(rn)]);
            else
            i=i-1;
            if(i==10)
            System.out.println("Backup Players");
        }
        System.out.println("**********Dream Team!!*********");
        ONEXBET.main(team);
        }
        else{
            System.out.println("Please select correct input.! thanks!!");
        }
        sc.close();
    }
}

