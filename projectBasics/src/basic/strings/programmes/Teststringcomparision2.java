package basic.strings.programmes;

public class Teststringcomparision2 {

	public static void main(String[] args) {
		String s1 = "Dharmendra";
		String s2 = "DHARMENDRA";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true

		
	}
}
