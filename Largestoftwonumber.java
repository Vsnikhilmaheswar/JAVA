
/* ###################################################*/
/*                                                    */
/*  AUTHOR:  VS NIKHIL MAMHESWAR                      */        
/*                                                    */
/*  PROBLEM: FIND THE LARGEST OF TEO NUMBER           */
/*                                                    */          
/*  DATE   : 27-11-2021                               */
/*                                                    */
/*####################################################*/
import java.util.Scanner;
public class Largestoftwonumber {
	public static void main(String[] agrs)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int num1=s.nextInt();
		System.out.println("enter the 2nd number");
		int num2=s.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" is larger");
		}
		else 
		{
			System.out.println(num2+" is larger");
		}
	}
}
