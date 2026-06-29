package programs;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int rev=0;
		
		while(num>0)
		{
			rev=rev*10+(num%10);
			num=num/10;
		}
		
		System.out.println(rev);
		
		//using stringbufferclass
		
		int num1=3456;
		
		StringBuffer reverse;
		
		StringBuffer sb=new StringBuffer(String.valueOf(num1));
		
		reverse=sb.reverse();
		System.out.println(reverse);

	}

}
