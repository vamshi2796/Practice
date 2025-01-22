package programs;

public class Secondlargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,15,16,18,21,30};
		int size=arr.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
			System.out.println(arr[size-2]);
	}

}
