import java.util.*;
class stringCount {
	static boolean isequal(String str)
	{
		int n = str.length();
		int num = 0, x = 1, i = n - 1;
		for (i = n - 1; i >= 0; i--)
		{
			if ('0' <= str.charAt(i) && str.charAt(i) <= '9')
			{
				num = (str.charAt(i) - '0') * x + num;
				x = x * 10;
				if(num>=n)
					return false;
			}
			else
				break;
		}
		return num == i + 1;
	}
	static public void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
		if (isequal(str))
			System.out.println("Yes");
		else
			System.out.println("No");
            sc.close();
	}
}