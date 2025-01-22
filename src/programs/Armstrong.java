package programs;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int org=371,rem=0,result=0;
		int num=org;
		while(num!=0) {
			rem=num%10;
			result+=Math.pow(rem, 3);
			num=num/10;
			}
		if(result==org) {
			System.out.println("armstrong no" + " " + result);
		}
		else
			System.out.println("notarmstrong no" + " " + result);

	}

}
