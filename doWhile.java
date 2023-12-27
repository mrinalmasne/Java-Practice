import java.util.*;
public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input;
		do
		{
			int marks=sc.nextInt();
			if(marks>=90)
				System.out.println("This is Good");
			else if(marks>=60 && marks<=89)
				System.out.println("This is also Good");
			else if(marks<=59 && marks>=0)
				System.out.println("This is Good as well");
			else
				System.out.println("Invalid");
			System.out.println("Do you want to print(1) or (0");
			input=sc.nextInt();
		}while(input==1);
		
	}

}
