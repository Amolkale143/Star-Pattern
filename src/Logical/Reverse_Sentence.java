package Logical;

public class Reverse_Sentence 
{
	
	  public static void main(String[] args) 
	  {
		  
		  String Org="I am playing Criket";  //playing am I
		  
		   String  S1=resersestring(Org);   //I am playing
		
		   System.out.println(S1);
	  }
		                                                  //0      1         2
	  public static String resersestring(String Sentance)   //I     am       playing
	  {
		  
		                String[] text=Sentance.split(" ");
		  
		                String Rev=""; //playing  am  I
		                
		                     //i=2                  2>=0     1
		                                          // 1>=0    0
		                                          //0>=0     -1
		                                          //-1>=0
		               for(int i=text.length-1;     i>=0;    i--)
		               {              
		            	              //0
		            	   Rev= Rev +text[i]+" ";       //playing  am +I
		               } 
		               
		               
		          return Rev;  //playing  am  I   
		               
		  
	  }
	  
	
	

}
