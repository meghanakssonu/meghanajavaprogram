
package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number=4;
       int count=0;
       
       if(number>1)
       {
    	   for(int i=1;i<=number;i++)
    	   {
    		   if(number%i==0)
    			   count++;
    	   }
    	   if(count==2)
    	   {
    	   System.out.println("prime number");  
    	   }
    	   else
    	   {
    		   System.out.println("not a prime number");    
    	   }
       }
       else {
    	   System.out.println("not a prime number");    
    	   }
		
	}

}
