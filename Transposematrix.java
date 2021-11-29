/* ###################################################*/
/*  AUTHOR:  VS NIKHIL MAMHESWAR                      */        
/*                                                    */
/*  PROBLEM: FIND THE TRANSPOSE OF MATRIX             */
/*                                                    */          
/*  DATE   : 27-11-2021                               */
/*                                                    */
/*####################################################*/
import java.util.*;
public class Transposematrix {
	public static void main(String args[]) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of row");
	int r=s.nextInt();
	System.out.println("enter the number of col");
	int c=s.nextInt();
	int i,j;
	int  matrix1[][]=new int[r][c];
	
	System.out.println("enter the elements of the matrix");
	for( i=0;i<r;i++)
	{
		for( j=0;j<c;j++)
		{
	    	matrix1[i][j]=s.nextInt();
		}
	}
	System.out.println("THE MATRIX YOU ENTERED");
	for(i=0;i<r;i++)
	{
		for( j=0;j<c;j++)
		{
	   System.out.print(matrix1[i][j]+"\t");
		}
		System.out.println();
	}
System.out.println("TRANSPOSE OF MATRIX");
	for(i=0;i<r;i++)
	{
		for( j=0;j<c;j++)
		{
	   System.out.print(matrix1[j][i]+"\t");
		}
		System.out.println();
	}
	
}
}


