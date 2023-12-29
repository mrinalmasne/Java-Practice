import java.util.*;
public class avgFunction {
	public static void findAvg(int a,int b,int c)
	{
		int avg=(a+b+c)/3;
		System.out.println("Average is:"+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three nos:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		findAvg(a,b,c);

	}

}
