//Write a program to toggle a bit a position = “pos” in a number “n”.
import java.util.*;
public class toggleBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=sc.nextInt();
		System.out.println("Enter position:");
        int pos=sc.nextInt();

	if(pos==1)
		{
		int bitMask=1<<pos;
		int newNo=bitMask | n;
		System.out.println(newNo);
		}
		else
		{
			int bitMask=1<<pos;
			int newNo=~(bitMask)& n;
		System.out.println(newNo);
			
		}
	//Easy Logic
//  int bitmask=1<<pos;
//  int newno=n^bitmask;
//  System.out.println(newno);
		

	}

}
