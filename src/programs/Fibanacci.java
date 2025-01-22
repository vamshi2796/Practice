package programs;

public class Fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int num=10;
	    System.out.println("Fibonacci Series till " + num + " terms:");

//		for(int i=0;i<num;i++) {
//			System.out.print(a+ ",");
//			int c=a+b;
//			a=b;
//			b=c;
//			}
	    while(a<=num) {
	    	System.out.print(a+ ",");
			int c=a+b;
			a=b;
			b=c;
	    }

	}

}
