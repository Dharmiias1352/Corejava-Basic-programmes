package basic.strings.programmes;

public class Teststringcomparision1 {

	public static void main(String[] args) {
		String s1 = "Dharmendra";
		String s2 = "Charishma";
		String s3 = "Sarayu";
		String s4 = "CharishmaDharma";
		String s5 = "CharishmaDharma";

		System.out.println(s4.equals(s5));//true
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//false
		
	}
}
