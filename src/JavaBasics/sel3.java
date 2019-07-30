package JavaBasics;

public class sel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int c[]= {2,5,8,7,4,10,4};
		for (int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
			if(c[i]==7)
			{
				System.out.println("The 7 number is in the position #: " + i);
				break;
			}
		}
		
	}

}
