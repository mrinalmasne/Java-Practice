import java.util.*;
public class CircumOfCircle {
	private static final double pi = 3.14;

	public static double circumference(int r)
	{
		double circum=2*pi*r;
		return circum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		int r=sc.nextInt();
		double c=circumference(r);
		System.out.println("Circumference of circle is:"+c);
	 

	}

}
