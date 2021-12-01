import java.util.Scanner;

public class Frequency {
public static void main(String ar[])
{
	Scanner s=new Scanner(System.in);
	System.out.print("enter the string");
	String str=s.nextLine();
	System.out.println("enter the alphabet");
    char ch=s.next().charAt(0);	
    int len=str.length();
    int c=0;
    for(int i=0;i<len;i++)
    {
    if(ch==str.charAt(i))
    {
    	c++;
    }
    }
    System.out.println("frequency = "+c);
}
}