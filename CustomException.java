import java.util.Scanner;


class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
     
    }  
}  


public class CustomException  
{  
   
    static void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
  
        throw new InvalidAgeException("age is not valid");    
    }  
       else
    	   System.out.println("age is valid");
     }    
    
    public static void main(String args[])  
    {  
        try  
        {  
           Scanner s = new Scanner(System.in);
           System.out.println("Enter the age");
           int n = s.nextInt();
            validate(n);  
        }  
        catch (InvalidAgeException ex)  
        {   
    
            System.out.println("Exception occured: " + ex);  
        }     
    }  
}  
