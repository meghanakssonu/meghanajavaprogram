package basic;

public class ConstClass {
	
	String name;
	
	ConstClass(String name)
	{
		this.name=name;//refers current member 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstClass a=new ConstClass("meghana");
		ConstClass b=new ConstClass("skanda");
		ConstClass c=new ConstClass("abhi");
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);

	}

}
