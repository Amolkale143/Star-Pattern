package Logical;

public class Pallendrome
{
	
	public static void main(String[] args) 
	{
		String original="madam";
		
		String Rev="";
		
		for(int i=original.length()-1; i>=0; i--) 
		{
			Rev=Rev + original.charAt(i);
			
		}
		
		if(original.equals(Rev)) 
		{
			System.out.println("String is a Pallendrom");
		}
		else
		{
			System.out.println("String is not a Pallendrom");
		}
		
		
		
		
	}
	
	

}
