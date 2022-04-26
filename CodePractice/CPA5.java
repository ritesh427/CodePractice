import java.util.*;

class Bicycle
{
    public String bicycleName , brand;
    public int cost , ageGroup;
    
    Bicycle()
    {
        this.bicycleName = "";
        this.brand = "";
        this.cost = 0;
        this.ageGroup = 0;
    }
 
}

class CPA5
{
    public static void main(String args[])
    {  
        int i , aG;
        String bN;
        
        Scanner sc = new Scanner(System.in);
        Bicycle[] ar = new Bicycle[4];
        
        for(i = 0 ; i < 4 ; i++)
        {
            Bicycle bicy = new Bicycle();
            bicy.bicycleName = sc.nextLine();
            bicy.brand = sc.nextLine();
            bicy.cost = Integer.parseInt(sc.nextLine()); 
            bicy.ageGroup = Integer.parseInt(sc.nextLine());
            ar[i] = bicy;
        }
        
        bN = sc.nextLine();
        aG = sc.nextInt();
        
        Bicycle[] op1 = findBicycleByAgeGrp(ar , aG);
        
        if(op1 == null)
        {
            System.out.println("Bicycle is not available for the given Agegroup");
        }
        else
        {
            i = 0;
            while(op1[i] != null)
            {
                System.out.println(op1[i].bicycleName);
                i++ ;
            }
        }
        int op2 = totalCostByBrand(ar , bN);
        
        if(op2 == 0)
            System.out.println("No Bicycle is available for given brand");
        
        else
            System.out.println(op2);
    }
    
    public static Bicycle[] findBicycleByAgeGrp(Bicycle[] ar1 , int aG)
    {
        Bicycle[] ar2 = new Bicycle[4];
        int j=0 , i , k;
        for( i = 0; i < ar1.length; i++)
        {
            if(ar1[i].ageGroup <= aG)
            {
                ar2[j] = ar1[i];
                j++;
            }
        }
        
        for( i=0 ; i < j ; i++)
        {
            for( k = i+1 ; k < j ; k++)
            {
                if(ar2[i].cost < ar2[k].cost)
                {
                    Bicycle tmp = ar2[k];
                    ar2[k] = ar2[i];
                    ar2[i] = tmp;
                }
            }
        }
        
        if(j == 0)
            return null;
        else
            return ar2;
    }
 
    public static int totalCostByBrand(Bicycle[] ar1,String bN)
    {
        int sum = 0 , i ;
        for( i=0 ; i < ar1.length ; i++)
        {
            if(bN.equalsIgnoreCase(ar1[i].brand))
            {
                sum = sum + ar1[i].cost;
            }
        }
        
        return sum;
    }
}