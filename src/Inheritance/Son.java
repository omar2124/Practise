package Inheritance;

public class Son extends Grandfather{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//I accessed the method Grandfather from another class using inheritance 
		Son s = new Son();
		s.city();
		System.out.println(s.i);
	}
	
	public void sonavtivities()
	{
		System.out.println("Add");
		System.out.println("Edit");
		System.out.println("Delete");
	}

}
