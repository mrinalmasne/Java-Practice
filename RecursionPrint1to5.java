//Q2. Print numbers from 1 to 5.
public class RecursionPrint1to5 {
	public static void printNum(int n)
	{
		if(n==6)
		{
			return;
		}
		System.out.println(n);
		printNum(n+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		printNum(n);

	}

}
