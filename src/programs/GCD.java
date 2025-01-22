package programs;

public class GCD {
	 static int Lcd(int n1,int n2) {
		if(n2!=0) {
			return Lcd(n2,n1%n2); /* 36,24      24,12        12*/
		}
		return n1;
	}
	 static int Lcm(int n1,int n2) {
		 return (n1/(Lcd(n1,n2)))*n2;
	 }
	 static int Lcmindiv(int n1, int n2) {
		 int greatest=Math.max(n1, n2);
			int smallest=Math.min(n1, n2);
			for(int i=greatest;;i+=greatest) {
				if(i%smallest==0)
					return i;
			}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=36,n2=60;
		int val=Lcd(n1,n2);
		System.out.println(val);
		int val1=Lcm(n1,n2);
		System.out.println(val1);
		int val2=Lcmindiv(n1,n2);
		System.out.println(val2);
		
		
		
		
		
		
		
		

	}

}
