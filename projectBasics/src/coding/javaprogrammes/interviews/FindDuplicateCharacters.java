package coding.javaprogrammes.interviews;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDuplicateCharacters("Dharmendra");
		printDuplicateCharacters("Charishma");
		printDuplicateCharacters("Harshini");
			}

	private static void printDuplicateCharacters(String word) {
		// TODO Auto-generated method stub
		char[] characters = word.toCharArray();
		//System.out.println(characters);
		Map<Character ,Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch: characters)
			//System.out.print(ch);
		{
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		// Iterate through HashMap to print all duplicate Characters
		Set<Map.Entry<Character, Integer>> entrySet =charMap.entrySet();
		//System.out.println(entrySet);
		for(Map.Entry<Character, Integer> entry: entrySet) {
			if(entry.getValue()>1)
			{
			System.out.println(entry.getKey());
		}
	}

}
}
