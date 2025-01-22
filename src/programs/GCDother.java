package programs;

public class GCDother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ai= {2,3,4,5,6};
		int[]bi= {2,3,4,5,7};
		//int fsa[];
		int large=Integer.MAX_VALUE;
		for(int k=0;k<ai.length-1;k++) {
			for(int j=0;j<bi.length-1;j++) {
				if(k==j) {
					System.out.println(k);
					int[] fsa= new int[10];
					for(int w=0;w<fsa.length-1;w++) {
						fsa[w]=k;
					}
					for(int gf:fsa)
					System.out.println(gf);
//					
//					for(int i=0;i<fsa.length;i++) {
//						
//						if(fsa[i]>large) {
//							large=fsa[i];
//							
//							
//						}
//						
					}
						
				}
				
			}
		}
	
		
	}


