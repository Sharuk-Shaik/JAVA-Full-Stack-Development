
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the two numbers:");
		
		float a,b;
		
		a= s.nextFloat();
		b= s.nextFloat();
		
		System.out.println("Enter the Operation + or - or * or /");
		
	    char x= s.next().charAt(0);
	    
	    switch(x) {
	    
	    case '+':
	    	System.out.println(a+b);
	    	break;
	    case '-':
	    	System.out.println(a-b);
	    	break;
	    case '*':
	    	System.out.println(a*b);
	        break;
	    case '/':
	    	System.out.println(a/b);	
	    	break;
	    default:
	    	System.out.println("Please choose a valid operator");
	    	break;
	    }
	 
	}

}
