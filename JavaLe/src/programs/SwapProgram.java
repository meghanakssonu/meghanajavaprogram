package programs;

public class SwapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=50;
		int b=20;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("swap value:"+a);
		System.out.println("swap value:"+b);
		
		//using arithmetic logic
		
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("swap value:"+x);
		System.out.println("swap value:"+y);
		

	}

}
