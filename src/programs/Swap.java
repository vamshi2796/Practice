package programs;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=6,c=7;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		
		System.out.println(a + "," + b + "," + c);

	}

}
