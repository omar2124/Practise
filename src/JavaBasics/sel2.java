package JavaBasics;

public class sel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int c[]= {2,5,8,7,4,10,4};
		for (int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
			sum=sum+c[i];
		}
		System.out.println("The sum of this array is: " + sum);
	}

}
