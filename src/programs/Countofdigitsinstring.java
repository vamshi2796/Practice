package programs;
public class Countofdigitsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sweety1238383gddg233veuyruyrv";
		char[]ch=s.toCharArray();
		int count=0;
		for(Character c:ch) {
			if(Character.isDigit(c)) {
				
				count++;

			}
		}
		System.out.println(count);

	}

}
