package programs;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","c","c++","java","Java","c","python"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate:"+arr[i]);
					flag=true;
				}
			}
		}

		if(flag==false)
		{
			System.out.println("not found");
		}
	}

}
