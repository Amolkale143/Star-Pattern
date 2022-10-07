package Logical;

import java.util.Scanner;

public class Even_odd 
{
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		//To take input
		System.out.println("Enter Number");
		
		    int Num=scan.nextInt();
		   //1==0 
		if(Num % 2==0) 
		{
			System.out.println("Given no is an even no");
		}
		else 
		{
			System.out.println("Given no is not an even no");
		}
		
		
	}
	

}
