//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.Using StringBuilder
import java.util.*;
public class SbreplaceLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++)
        {
        	if(sb.charAt(i)=='e')
        	{
        	    sb.setCharAt(i,'i');
        		
        	}
        	else
        	{
        		sb.charAt(i);
        	}
        	
        }
        System.out.println("Replaced String:");
        System.out.println(sb);
        
       }

}
