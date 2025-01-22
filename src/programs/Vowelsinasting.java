package programs;

public class Vowelsinasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="think positive";
		char[] ch=s2.toCharArray();
		int count=0;
		for(Character c:ch) {
			if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
 