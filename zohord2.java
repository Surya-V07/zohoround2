package zoho;

import java.util.Scanner;

public class zohord2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[]a=s.toCharArray();
		int max=a.length,mid=a.length/2;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
				if(j>=max)
				{
					System.out.print(a[mid++]+" ");
					if(mid==a.length)
					{
						mid=0;
					}
				}
				else 
				{
					System.out.print("  ");
				}
			}
			mid=a.length/2;
			System.out.println();
			max--;
		}
	}
}
