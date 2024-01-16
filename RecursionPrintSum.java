//Print the sum of first n natural numbers.
public class RecursionPrintSum {

	public static void printSum(int n,int sum)
	{
		if(n==0)
		{
			System.out.println(sum);
			return;
		}
		sum+=n;
		printSum(n-1,sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSum(6,0);

	}

}
