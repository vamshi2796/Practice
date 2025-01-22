package programs;

public class Reverseofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Apple is delicious";
		String[] word=s1.split(" ");
		String revstring="";
		for(int i=0;i<word.length;i++) {
		String words=word[i];
		String revword="";
		for(int j=words.length()-1;j>=0;j--) {
			revword=revword+words.charAt(j);
		}
			//revstring=revstring+revword+" ";
		revword=revword+" ";
		System.out.print(revword);
		}
		//System.out.println(revstring);

	}

}
