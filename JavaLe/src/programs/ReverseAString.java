package programs;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="meghana";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
		}
		System.out.print(rev);
	}

}
