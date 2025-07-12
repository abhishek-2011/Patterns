package Patterns;
import java.util.Scanner;
public class P7 {
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int n=sc.nextInt();
		char p;
		for(int i=n;i>=1;i--)
		{
			p='A';
			for(int k=0;k<(n-i)*2;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>n-i;j--)
			{
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}
		sc.close();
	}
}
