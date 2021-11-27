/* ###################################################*/
/*                                                    */
/*  AUTHOR:  VS NIKHIL MAMHESWAR                      */       
/*                                                    */
/*  PROBLEM: FIND THE VOWELS,CONCONSANTS IN A STRING  */
/*                                                    */          
/*  DATE   : 27-11-2021                               */
/*                                                    */
/*####################################################*/
import java.util.Scanner;
public class Vowelsconsosants {
	public static void main(String agrs[]) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=s.nextLine();
	int c=0;
	int v=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'|| ch=='A' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o'|| ch=='u'|| ch=='U')
		{
			
			v++;
		}
		else if(ch>='a' && ch<='z')
		{
			
			c++;
		}
	}
System.out.println("vowels = "+v);
System.out.println("consonants = "+c);
}
}
