import java.util.*;
public class checkPrimeFunction {
	public static void checkPrime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime");
				break;
			}
			else
			{
				count++;
			}
			
		}
		if(count==n-2)
		{
			System.out.println("Prime");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		checkPrime(n);
		

	}

}
