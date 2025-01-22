package programs;

import java.util.Arrays;

public class Anangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="silent";
		String b="listen";
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		if(a.length()==b.length()) {
			char[]ch1=a.toCharArray();
			char[]ch2=b.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
				boolean val=Arrays.equals(ch1, ch2);
			if(val==true) {
				System.out.println(a + "," + b + " are anangram");
			}
			else
				System.out.println(a + "," + b +  " are anangram");
			
		}

	}

}
