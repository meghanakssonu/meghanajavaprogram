package programs;

public class MissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //array should not have duplicates
		//array  no need to be in sorted order
		//value should be in range
		int a[]= {1,2,4,5,6};
		int sum1=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
		}
		int sum2=0;
		for(int i=1;i<=6;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2-sum1);
	}

}
