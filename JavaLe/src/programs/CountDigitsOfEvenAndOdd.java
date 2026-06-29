package programs;

public class CountDigitsOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=676767;
		int evencount=0;
		int oddcount=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				evencount++;
	
				System.out.println("even number:"+rem);
			}
			else
			{
				oddcount++;
				System.out.println("odd number:"+rem);
			}
			num=num/10;
		}
		System.out.println(evencount);
		System.out.println(oddcount);

	}

}
