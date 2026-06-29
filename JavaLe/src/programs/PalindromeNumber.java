package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		int rev=0;
		int actualnum=num;
		
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num=num/10;
			
		}
		
		System.out.println(rev);
		
		if(actualnum==rev)
		{
			System.out.println("palindrome");
	
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
