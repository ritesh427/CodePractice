import java.util.Scanner;

public class Solution {

    public static void main(String [] args ) {
        Scanner sc= new Scanner(System.in);
        Bicycle bc[] =new Bicycle[4];
        for(int i = 0;i < 4; i++){
            String bName = sc.nextLine();
            String bBrand = sc.nextLine();
            int bCost = Integer.parseInt(sc.nextLine());
            int bAgeGroup = Integer.parseInt(sc.nextLine());
            bc[i] = new Bicycle(bName, bBrand, bCost, bAgeGroup);
        }

        
    }

    public static Bicycle[] findBicycleByAgeGrp() {
        
    }

    public static int TotalCostByBrand() {
        
    }

}

class Bicycle {
    String bName;
    String bBrand;
    int bCost;
    int bAgeGroup;

    public Bicycle(String bName, String bBrand, int bCost, int bAgeGroup) {
        this.bName = bName;
        this.bBrand = bBrand;
        this.bCost = bCost;
        this.bAgeGroup = bAgeGroup;
    }

    public String getbName() {
        return bName;
    }

    public String getbBrand() {
        return bBrand;
    }

    public int getbCost() {
        return bCost;
    }

    public int getAgeGroup() {
        return bAgeGroup;
    }

    public void setbName(String bName){
        this.bName=bName;
    }

    public void setbBrand(String bBrand){
        this.bBrand=bBrand;
    }

    public void setbCost(int bCost){
        this.bCost=bCost;
    }

    public void setbAgeGroup(int bAgeGroup){
        this.bAgeGroup=bAgeGroup;
    }

}