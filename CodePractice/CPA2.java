import java.util.Scanner;
class CPA2
{
    public static void main(String args[])
    {
        int id,price,i;
        String name,use,quality;
        
        Scanner sc=new Scanner(System.in);
        Granite[] arr=new Granite[4];
        
        for(i=0;i<4;i++)
        {
            id=sc.nextInt();
            sc.nextLine();
            name=sc.nextLine();
            use=sc.nextLine();
            price=sc.nextInt();
            sc.nextLine();
            quality=sc.nextLine();
            arr[i]=new Granite(id,name,use,price,quality);
        }
        
        String name2=sc.nextLine();
        int total=sc.nextInt();
        sc.nextLine();
        String q=sc.nextLine();
        
        double result=getTotalPriceBasedOnSqFt(arr,total,name2);
        
        if(result==0)
        System.out.println("Granite Name is not found");
        
        else
        System.out.println(result);
        
        Granite ob=findGraniteBasedOnQuality(arr,q);
        
        if(ob==null)
        System.out.println("There is no matching granite with the given quality");
        
        else
        {
            System.out.println(ob.getGraniteName());
            System.out.println(ob.getQuality());
            System.out.println(ob.getPricePerSqFt());
        }

    }

    public static double getTotalPriceBasedOnSqFt(Granite[] arr,int total,String name2)
    {
        int i;
        double res=0.0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i].getGraniteName().equalsIgnoreCase(name2))
            res=arr[i].getPricePerSqFt() * total + (0.2 * total); 
        }
        return res;
    }

    public static Granite findGraniteBasedOnQuality(Granite[] arr,String q)
    {
        int i,j=0,k;
        Granite[] temp;
        
        for(i=0;i<arr.length;i++)
        {
            if(arr[i].getQuality().equalsIgnoreCase(q))
            j++;
        }
        
        if(j==0)
        return null;
        
        else
        {
            temp=new Granite[j];
            j=0;
            
            for(i=0;i<arr.length;i++)
            {
                if(arr[i].getQuality().equalsIgnoreCase(q))
                temp[j++]=arr[i];
            }
 
            for(i=0;i<j-1;i++)
            {
                for(k=0;k<j-1;k++)
                {
                    if(temp[k].getPricePerSqFt() > temp[k+1].getPricePerSqFt())
                    {
                        Granite t=temp[k];
                        temp[k]=temp[k+1];
                        temp[k+1]=t;
                    }
                }
            }
            return temp[1];
 
        }

    }
}

class Granite
{
    private int graniteId;
    private String graniteName;
    private String graniteUse;
    private int pricePerSqFt;
    private String quality;
 
    public Granite(int graniteId,String graniteName,String graniteUse,int pricePerSqFt, String quality)
    {
        this.graniteId=graniteId;
        this.graniteName=graniteName;
        this.graniteUse=graniteUse;
        this.pricePerSqFt=pricePerSqFt;
        this.quality=quality;
    }
    public int getGraniteId()
    {
        return graniteId;
    }
    public String getGraniteName()
    {
        return graniteName;
    }  
    public String getGraniteUse()
    {
    return graniteUse;
    }
    public int getPricePerSqFt()
    {
    return pricePerSqFt;
    }
    public String getQuality()
    {
    return quality;
    }
}