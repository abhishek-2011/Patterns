package Patterns;
import java.util.Scanner;
public class P2 {
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=0;k<(n-i)*2;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}