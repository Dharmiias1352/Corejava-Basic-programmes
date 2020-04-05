package basic.strings.programmes;

public class TestimmutableString {

	public static void main(String[] args) {
		String s = "Dharmendra";
		s = s.concat("Charishma");
		System.out.println(s);//In such case, s points to the "Dharmendra Charishma". Please notice that still Dharmendra object is not modified
	}
}
