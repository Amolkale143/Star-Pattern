package Logical;

public class odd_Even 
{
	
	public static void main(String[] args) 
	{

		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		int b=0;
		int c=0;
		
	
		for(int i=1; i<10; i++) 
		{
			if(a[i] % 2 == 0)
			{
			 	b++;
			}
			else
				c++;
			
		}
		
		System.out.println("For Even no count"+b);
		System.out.println("For Even no count"+c);
		
		
	}
	

}
