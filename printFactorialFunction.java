import java.util.*;
public class printFactorialFunction {
	public static void printFactorial(int n)
	{
		if(n<0)
		{
			System.out.println("Invalid number");
			return;
		}
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printFactorial(n);
		

	}

}
