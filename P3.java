package Patterns;
import java.util.Scanner;
public class P3 {
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int k=0;k<i*2-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}