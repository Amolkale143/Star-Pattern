package Logical;

public class Reverse_String 
{
	
	public static void main(String[] args) 
	{
		
		String sname="Dipak";
		
		String Revsname="  ";
		
		for(int i=sname.length()-1; i>=0; i--) 
		{
			Revsname=Revsname + sname.charAt(i);
			
		}
		
		System.out.println(Revsname);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
