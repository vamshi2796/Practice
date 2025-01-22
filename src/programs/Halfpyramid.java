package programs;

public class Halfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
//		for(int i=1;i<=rows;++i) {
//			for(int j=1;j<=i;++j) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		for(int k=rows+1;k>=1;--k) {
//			for(int l=1;l<=k;++l) {
//				System.out.print(l + " ");
//			}
//			System.out.println();
//		}	
//		}
//	
//		try {
//			Class.forName("test");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	for(int i=1;i<=rows;++i) {
		for(int j=i;j<rows;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++) {
			System.out.print(k);
		}
		System.out.println();
	}
	
}
}