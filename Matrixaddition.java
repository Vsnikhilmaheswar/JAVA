import java.util.Scanner;

public class Matrixaddition {
	public static void main(String args[]) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of row");
	int r=s.nextInt();
	System.out.println("enter the number of col");
	int c=s.nextInt();
	int [][]matrix1=new int[5][5];
	int [][]matrix2=new int[5][5];
	int [][]addmat=new int[10][10];
	System.out.println("enter the elements of first matrix");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
	    	matrix1[r][c]=s.nextInt();
		}
	}
	System.out.println("enter the elements of 2nd matrix");
	for(int k=0;k<r;k++)
	{
		for(int m=0;m<c;m++)
		{
	     matrix2[r][c]=s.nextInt();
		}
	}
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			addmat[r][c]=matrix1[r][c]+matrix2[r][c];
			System.out.println(addmat[r][c]+" ");
		}
		System.out.println();
	}
}
}
