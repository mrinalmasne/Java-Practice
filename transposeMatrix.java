import java.util.*;
public class transposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //rows
		int m=sc.nextInt(); //columns
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<m;j++)
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i][j]);
			}
			
			
		}

	}

}
