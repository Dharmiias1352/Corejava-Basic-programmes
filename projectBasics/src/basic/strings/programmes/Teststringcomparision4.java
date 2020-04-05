package basic.strings.programmes;

public class Teststringcomparision4 {

	public static void main(String[] args) {
		String s1 = "Dharmendra";
		String s2 = "Charishma";
		String s3 = new String ("Dharmendra");
		System.out.println(s1.compareTo(s2));//s1>s2-----1
		System.out.println(s2.compareTo(s3));//s2>s3----(-1)
		System.out.println(s1.compareTo(s3));//s1=s3----0

	}

}
