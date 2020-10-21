import java.util.*;
public class Longsubseq {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String arr[]=new String[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextLine();
	}
	for(int k=0;k<n;k++)
	{
		String w="";
		String e="";
		for(int q=0;q<n;q++)
		{
			if(k!=q)
			{
				String s=new String();
				String s1=new String();
	int a[][]=new int [arr[k].length()+1][arr[q].length()+1];
	int i,j;
	int max=-1;
	for( i=0;i<=arr[k].length();i++)
	{
		for(j=0;j<=arr[q].length();j++)
		{
			if(i==0 ||j==0)
			{
				a[i][j]=0;
			}
			else if(arr[k].charAt(i-1)==arr[q].charAt(j-1))
				a[i][j]=a[i-1][j-1]+1;
			else
				a[i][j]=Math.max(a[i-1][j], a[i][j-1]);
		}
	}
	int ma=a[arr[k].length()][arr[q].length()];
	if(ma>max)
	{
		max=ma;
		w=s;
		e=s1;
	}
		}
	}
		System.out.println(w+" "+e);
}
}
}
/*5
1131
2134
4134
4145
8414*/

