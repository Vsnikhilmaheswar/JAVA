import java.util.Scanner;

/* ###################################################*/
/*                                                    */
/*  AUTHOR:  VS NIKHIL MAMHESWAR                      */       
/*                                                    */
/*  PROBLEM: CHECK A NUMBER IS PRIME OR NOT           */
/*                                                    */          
/*  DATE   : 27-11-2021                               */
/*                                                    */
/*####################################################*/
public class Primenumber {
	public static void main(String[] args)
    {
		Scanner s=new Scanner(System.in);
       System.out.println("enter the number to be checked "); 
       int fact=0;
       int num=s.nextInt();
      
       for(int i=2;i<num/2;i++)
       {
           if(num%i==0)
           {
           fact=1;
           break;
           }
       }
           if(fact==0)
           {
            System.out.println(num+" is a prime number");
           }
           else 
           {
System.out.println(num+" is not a prime number");
           }
    }
}
