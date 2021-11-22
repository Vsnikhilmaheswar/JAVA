import java.util.Scanner;

public class Simplecalculator
{
	public static void main(String[] nikhil) 
	{
		Scanner s=new Scanner(System.in);
	System.out.println("enter 1st number ");
	int num1=s.nextInt();
	System.out.println("enter 2nd number ");
	int num2=s.nextInt();
	System.out.println("Enter the operator( + , - , / , * ");
	char op=s.next().charAt(0);
	if(op=='+')
	{
         int result;
		 result=num1+num2;
		 System.out.println("result = "+result);
	}
	else if(op=='-')
	{
        int result;
		 result=num1-num2;
		 System.out.println("result = "+result);
	}
	else if(op=='*')
	{
         int result;
		 result=num1*num2;
		 System.out.println("result = "+result);
	}
	else if(op=='/')
	{
         int result;
         result=num1/num2;
		 System.out.println("result = "+result);
	}
	   
	   
    } 

}
