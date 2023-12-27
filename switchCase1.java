import java.util.*;
public class switchCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				   Scanner sc=new Scanner(System.in);
				        System.out.println("Enter first number:");
				        int a=sc.nextInt();
				        System.out.println("Enter second number:");
				        int b=sc.nextInt();
				        System.out.println("Enter operator:");
				        String op=sc.next();
				       switch(op)
				        {
				        case "+":
				        	System.out.println(a+b);
				        	break;
				        case "-":
				        	System.out.println(a-b);
				        	break;
				        case "*":
				        	System.out.println(a*b);
				        	break;
				        case "/":
				        	System.out.println(a/b);
				        	break;
				        case "%":
				        	System.out.println(a%b);
				        	default:
				        		System.out.println("Invalid operator");
				        	 }
				        
				       }
}


	


