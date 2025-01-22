package programs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="apple is healthy";
		String s2="healthy";
		String[] s1a=s1.split(" ");
		
		if(s1.contains(s2)) {
			System.out.println("substring is present");
		}
		for(String a:s1a) {
			if(a.contains(s2)) {
				System.out.println("substring2 is present");
			}
		}
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		Date date=new Date();
		//DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		
		System.out.println(format.format(date));

	}

}
