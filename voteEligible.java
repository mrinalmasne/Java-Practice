import java.util.*;
public class voteEligible {
	public static void eligible(int a)
	{
		
		if(a>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not eligible for voting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		eligible(age);
	
		

	}

}
