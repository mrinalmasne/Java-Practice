import java.util.*;
public class findGreatest {
	public static void greater(int a,int b)
	{
		if(a>b)
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter tow nos:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		greater(x,y);
		

	}

}
