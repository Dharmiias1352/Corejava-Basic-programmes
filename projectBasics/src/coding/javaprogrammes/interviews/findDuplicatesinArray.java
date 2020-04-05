package coding.javaprogrammes.interviews;

public class findDuplicatesinArray {
	public static void main(String[] args) {
		
		int [] arr= new int[] {1,2,3,3,2,5,8};
		System.out.println("Print Duplicates: ");
		for(int i=0; i<arr.length; i++ ) {
			for(int j=i+1; i<arr.length; j++) {
				if(arr[i]==arr[j])
				
					System.out.println(arr[i]);
				}
			
		}
		

	}
}




