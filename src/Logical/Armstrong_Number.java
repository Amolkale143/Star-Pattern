package Logical;

public class Armstrong_Number
{
	
	public static void main(String[] args)
	{
		int Org=153;             //1^3  +  5^3  +  3^3
		                         //1    + 125   +   27 
		
		int Sum=0;   //153   
		
		   // i=153        153>0     i=153/10=15.3
		                 //15>0      i=15/10=1.5
		                 //1>0       i=1/10=0.1
		                 //0>0
		for(int i=Org;     i>0;      i=i/10) 
		{
			        int  rem=i % 10;   //1%10=1
			        
			       Sum =Sum +(rem*rem*rem); //153
		}
		
		//153==153
		if(Org==Sum) 
		{
			System.out.println("given no is an Armstrong no");
		}
		else 
		{
			System.out.println("given no is not an Armstrong no");
		}
		
		
		
		
	}

}
