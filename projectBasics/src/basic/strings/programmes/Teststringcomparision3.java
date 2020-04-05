package basic.strings.programmes;

public class Teststringcomparision3 {

	public static void main(String[] args) {
		String s1 = "Dharmendra";
		String s2 = "Charishma";
		String s3 = new String ("Dharmendra");
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
	}

}
