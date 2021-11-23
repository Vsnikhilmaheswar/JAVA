import java.util.Scanner;

public class SimpleCalculatorusingswitch {

	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
System.out.println("Enter the 1st number");
int num1=s.nextInt();
System.out.println("Enter the 2nd number");
int num2=s.nextInt();
System.out.println("enter operator (+ , - , * , / )");
char ch=s.next().charAt(0);
switch(ch)
{
case'+':
{
int result=num1+num2;
System.out.println("result = "+result);
break;
}
case'*':
{
int result=num1*num2;
System.out.println("result = "+result);
break;
}
case'-':
{
int result=num1-num2;
System.out.println("result = "+result);
break;
}
case'/':
{
int result=num1/num2;
System.out.println("result = "+result);
break;
}
default:
	System.out.println("wrong operator");
}

}

}
