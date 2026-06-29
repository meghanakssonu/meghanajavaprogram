package basic;

public class EnhancedForSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		int search_term=100;
		boolean status=false;
		for(int value:a)
		{
			if(value==search_term)
			{
				System.out.print("elements found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("elements not found");
		}

	}

}
