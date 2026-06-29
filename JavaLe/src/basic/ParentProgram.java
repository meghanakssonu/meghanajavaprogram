package basic;

public class ParentProgram {
	//instance variable
	String firstname;
	
	ParentProgram(){
		firstname="meghana";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentProgram name=new ParentProgram();
		name.newCutomizedMethod();
		ChildProgram name1=new ChildProgram();
		name1.childMethod();

	}
	
	private void newCutomizedMethod() {
		System.out.println(firstname);

		
	}

}
