package basic;

public class ArrayRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="madam";
		String rev="";
		for(int i=0;i<name.length();i++)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("NP");
		}

	}

}
