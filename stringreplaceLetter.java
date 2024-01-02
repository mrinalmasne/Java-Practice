//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
import java.util.*;
public class stringreplaceLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		String result=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='e')
			{
				result+='i';
			}
			else
			{
				result+=s.charAt(i);
			}
			
		}
		System.out.println("Replaced String:"+result);

	}

}
