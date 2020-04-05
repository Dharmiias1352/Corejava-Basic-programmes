package coding.javaprogrammes.interviews;

public class findDuplicatesinString {

	public static void main(String[] args) {
		String str = "sharmar";
		int count=0;
		char[] input =str.toCharArray();
		for(int i=0; i<str.length();i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(input[i]==input[j]) {
					System.out.println(input[i]);
				}
				count++;
				
			}
		}

	}

}
