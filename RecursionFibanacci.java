//Q5. Print the fibonacci sequence till nth term.
public class RecursionFibanacci {
	public static void printFibonacci(int a,int b,int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(a);
		printFibonacci(b,a+b,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFibonacci(0,1,7);

	}

}
