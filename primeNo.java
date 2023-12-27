import java.util.*;
public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(" Not Prime");
				break;
			}
			else
			{
				cnt++;
			}
			
		}
		if(cnt==n-2)
			System.out.println("Prime");
		

	}

}
