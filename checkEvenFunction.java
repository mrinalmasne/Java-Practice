import java.util.*;
public class checkEvenFunction {
	public static void checkEven(int x)
	{
		if(x%2==0)
		{
			System.out.println("Even no");
		}
		else
			System.out.println("Odd no");
	  
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to check even or odd!!!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    
	    checkEven(n);

	}

}
