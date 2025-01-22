package programs;

public class Factorial {
	static int factor(int fact) {
		if(fact!=0) {
			return fact*factor(fact-1);
		}
		else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int facts=7,result;
		result=factor(facts);
		System.out.println(result);
		
		
		
	}

}
