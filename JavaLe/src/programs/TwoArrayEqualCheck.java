package programs;

public class TwoArrayEqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status=true;
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,5,4,5};
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					status=false;
				}
			}
		}
			else 
				{
				status=false;
				}

		if(status==true)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
