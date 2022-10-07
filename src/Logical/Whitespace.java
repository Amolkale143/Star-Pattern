package Logical;

public class Whitespace 
{
	public static void main(String[] args) 
	{
		String org="ab c d";
		
		int Count=0; //2
		
		    //i=0          0<=5                   1
		                 //1<=5                   2
		                  //2<=5                  3
		                  //3<=5                  4
		                  //4<=5                  5
		                  //5<=5                  6
		                  //6<=5
		for(int i=0;       i<=org.length()-1;    i++) 
		{
			           //d               //5
			   char charvalue=org.charAt(i);
			   
			      //d
			   if(charvalue==' ') 
			   {
				   Count++; 
			   }
			   
			   
		}
		
		System.out.println(Count);
		
		
		
	}
	

}
