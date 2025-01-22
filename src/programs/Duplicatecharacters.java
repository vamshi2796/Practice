package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Duplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="rpactice makes eprfect";
		int[] ar= {1,3,5,3,1,4,6};
		char[]ch=word.toCharArray();
	Set<Integer>	hs =new HashSet<>();
	Set<Integer> lc=new HashSet<>();
	for(Integer c:ar) {
	
		if(!hs.add(c)) {
			//lc.add(c);
			//System.out.print(c + ",");
			
		}
		
		}
//	for(Integer dp:lc) {
//		//System.out.print(dp + " ");
//	}
	
	
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else
				hm.put(c, 1);
		}
	
		char minchar=word.charAt(0);
		int mincount=hm.get(minchar);
		for (Map.Entry<Character,Integer> entry : hm.entrySet()) {
			//if(entry.getValue()>1)
           // System.out.println(entry.getKey() + ":" + entry.getValue());
			if(entry.getValue()<mincount) {
				minchar=entry.getKey();
				mincount=entry.getValue();
			}
        }
		System.out.println(minchar);
		System.out.println(mincount);
		}

	}


