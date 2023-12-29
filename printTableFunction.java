import java.util.*;
public class printTableFunction {
	public static void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+n*i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printTable(n);

	}

}
