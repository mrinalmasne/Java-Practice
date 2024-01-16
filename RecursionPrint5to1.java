//Q1. Print numbers from 5 to 1.
public class RecursionPrint5to1 {
	public static void printNum(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printNum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printNum(n);

	}

}
