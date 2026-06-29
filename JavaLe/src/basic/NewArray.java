package basic;

public class NewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int array
		int[] myarray= {18,12,73,14,50};
		
		System.out.print(myarray[1]);
		
		//resitrict lengthto array and assign value
		
		int[] restrictArray=new int[5];
				restrictArray[0]=10;
		restrictArray[1]=20;
		restrictArray[2]=30;
		restrictArray[3]=40;
		restrictArray[4]=50;//if you increase length you will get indexbound out of length exception
		

	}

}
