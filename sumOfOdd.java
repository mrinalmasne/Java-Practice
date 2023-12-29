import java.util.*;
public class sumOfOdd {
	public static int sumOdd(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no:");
		int n=sc.nextInt();
		int sumodd=sumOdd(n);
		System.out.println("Sum of odd no is:"+sumodd);

	}

}
