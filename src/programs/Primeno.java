package programs;

public class Primeno {
	static boolean prime(int n) {
		if(n<2)
			return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) 
				return false;
			
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=11;
		//System.out.println(prime(num));
		int low=1,upper=100;
		for(int j=low;j<=upper;j++) {
			if(prime(j)) {
				System.out.println(j);
			}
		}

	}

}
