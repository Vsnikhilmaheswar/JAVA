/* ###################################################*/
/*  AUTHOR:  VS NIKHIL MAMHESWAR                      */        
/*                                                    */
/*  PROBLEM: FIND THE REVERSE OF STRING               */
/*                                                    */          
/*  DATE   : 28-11-2021                               */
/*                                                    */
/*####################################################*/
import java.util.Scanner;

public class Reversestring 
{
public static void main(String ag[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string to be reversed");
	String str=s.nextLine();
	int len=str.length();
	System.out.println("REVERSED STRING \n");
	for(int i=len-1;i>=0;i--)
	{
	System.out.print(str.charAt(i));
	}
}
}
