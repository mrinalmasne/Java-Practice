import java.util.*;
public class countNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no:");
		int n=sc.nextInt();
		System.out.print("Enter "+n+"numbers:");
		int n1;
		int cntP=0,cntN=0,cnt0=0;
		for(int i=1;i<=n;i++)
		{
			n1=sc.nextInt();
		
		
			if(n1>0)
			{
				cntP++;
				
			}
			else if(n1<0)
			{
				cntN++;
				
			}
			
			else
				{
				   cnt0++;
				
				}
		}
		System.out.println("Positive nos are:"+cntP);
		System.out.println("Negative nos are:"+cntN);
		System.out.println("Zeros are:"+cnt0);
	}
			
		

	}


