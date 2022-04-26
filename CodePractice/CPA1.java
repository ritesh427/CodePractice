import java.util.*;
import java.lang.*;
import java.io.*;


class CPA1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		Account[] ac=new Account[4];
		for(int i=0;i<4;i++)
		{
		    int num=sc.nextInt();
		    sc.nextLine();
		    String name=sc.nextLine();
		    String type=sc.nextLine();
		    double balance=sc.nextDouble(); 
		    sc.nextLine();
		    ac[i]=new Account(num,name,type,balance);
		}
		
		String newname=sc.nextLine();
		double newbalance=sc.nextDouble();
		
		
		int ans1=countacctbyname(ac,newname);
		
		if(ans1==0)
	        System.out.println("No Account found with given account name");
	    
	        else
	        System.out.println(ans1);
		
		
		Account[] ans2=searchbybal(ac,newbalance);
		
		if(ans2==null)
		System.out.println("No such Account exists");
		
		else{
	       
	        for(int i=0;i<ans2.length;i++)
	        {  
	           System.out.println(ans2[i].getName());
	        }
		}
		
	}
	
	
	public static int countacctbyname(Account[] a,String name)
	{
	    int c=0;
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i].getName().equalsIgnoreCase(name))
	        {
	            c++;
	        }
	    }
	    if(c==0)   return 0;
	    return c;
	}
	
	public static Account[] searchbybal(Account[] t ,double balance)
        {
        int j=0;
        Account[] help;
        
        for(int i=0;i<t.length;i++)
        {
            if(t[i].getBalance()>=balance)
            {
                j++;
            }
        }
        
        help=new Account[j];
        j=0;
        
        for(int i=0;i<t.length;i++)
        {
            if(t[i].getBalance()>=balance)
            {
                help[j++]=t[i];
            }
        }
   
        for (int i = 0; i < j ; i++)
        {
            for (int k = i+1; k < j ; k++) 
            {
                if(help[k].getBalance()<help[i].getBalance())
                {
                    Account temp = help[k];
                    help[k] = help[i];
                    help[i] = temp;
                }
            }
        }
       
        if(j==0)
        return null;
       
        return help;
    }
}



class Account
{
	private int num;
	private String name;
	private String type;
	private double balance;
	
	public Account(int num,String name,String type,double balance)
	{
		this.num=num;
		this.name=name;
		this.type=type;
		this.balance=balance;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}