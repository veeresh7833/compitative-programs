import java.util.*;
public class Cuttingamaterial {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		int ans=(n*n+n+2)/2;
		System.out.println(ans);
	}
}
}
