package JavaBasics;

public class reverdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "omar";
		String t = "";
		
		for (int i=s.length()-1; i>=0; i--)
		{
			t = t + s.charAt(i);
			
		}
		System.out.println(t);
		if (s.equals(t))
		{
			System.out.println("Both strings are the same");
		}
		else
		{
			System.out.println("The strings are different");
		}
	}

}
