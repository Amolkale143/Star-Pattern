 package Logical;

public class Reverse_Number
{
	public static void main(String[] args) 
	{
		
		int Org=123456;               //4321
		
		int Rev=0;  //4321
		
		   //i=1234       1234>0     i=1234/10=123.4
		                 //123>0     i=123/10=12.3
		                 //12>0      i=12/10=1.2
		                 //1>0       i=1/10=0.1
		                 //0>0
		for(int i=Org;    i>0;       i=i/10)
		{
			        int  rem=i % 10;  //1%10=1
			        
			          Rev= Rev*10  + rem;   //4321
			
		}
		
		System.out.println(Rev);
		
	}
	

}
