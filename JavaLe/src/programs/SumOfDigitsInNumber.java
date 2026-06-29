package programs;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=23454;
        int sum=0;
        
        while(num>0)
        {
        	sum=sum+num%10;
        	num=num/10;
        }
        System.out.println("sum of the number:"+sum);
		
	}

}
