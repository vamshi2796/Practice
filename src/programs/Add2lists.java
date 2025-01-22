package programs;

import java.util.ArrayList;
import java.util.List;

public class Add2lists {
	static <T> void printArray(T[] array) {
		for(T elements:array) {
			System.out.print(elements);
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList<String>();
		List l2=new ArrayList<String>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		
		l2.add("4");
		l2.add("5");
		l2.add("6");
		
		//l1.add(l2);
		l1.addAll(l2);
		
		System.out.println(l1);
		
		
        Integer[] intArray = {1, 2, 3}; 
        String[] strArray= {"Hello","World"};
        printArray(intArray);
        printArray(strArray);
        

//		String s1="wish";
//		String s2="wish";
//		//System.out.println(s1==s2);
//		//System.out.println(s1.equals(s2));
//		
//		String s3=new String("wish");
//		
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s3));
		String s1 = "Java";  

		String s2 = "Java";  

		StringBuilder sb1 = new StringBuilder();  

		sb1.append("Ja").append("va");  

		System.out.println(s1 == s2); // true

		System.out.println(s1.equals(s2));  //true

		System.out.println(sb1.toString() == s1);  //false

		System.out.println(sb1.toString().equals(s1)); //true
		 

	}

}
