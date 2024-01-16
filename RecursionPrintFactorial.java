//Print factorial of a number n.
public class RecursionPrintFactorial {
	public static void printFactorial(int n,int fact)
	{
		if(n==0)
		{
			System.out.println(fact);
			return;
		}
		fact*=n;
		printFactorial(n-1,fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFactorial(6,1);

	}

}
