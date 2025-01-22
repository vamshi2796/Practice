package programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch="krishna is god";
		String rev="";
		for(int i=ch.length()-1;i>=0;i--) {
			rev=rev+ch.charAt(i);
			
		}
		System.out.println(rev);
		if(rev==ch) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
		

	}

}
