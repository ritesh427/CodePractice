/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		for (int i = 0; i < l; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x==1 || y==1)
{
printf(-1);
}
else if(prime (x,y)==1)
{
printf(1);
}
else
{
printf (0);
}
		}
	}
}
