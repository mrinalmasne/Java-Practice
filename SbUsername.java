//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.(Using String Builder)
import java.util.*;
public class SbUsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter email:");
       String email=sc.nextLine();
       StringBuilder sb=new StringBuilder(email);
       for(int i=0;i<sb.length();i++)
       {
    	   if(sb.charAt(i)=='@')
    	   {
    		   sb.delete(i, '@');
    		   break;
    	   }
    	   else
    	   {
    		   sb.charAt(i);
    	   }
    	   
       }
       System.out.println("Username is:");
       System.out.println(sb);
       
	}

}
