package basic.coding.programmes;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse = " ";
		Scanner in = new Scanner(System.in);
		int length;
		System.out.println("Enter the number or String");
		original = in.nextLine();
		length=original.length();
		//System.out.println(original);
		//System.out.println(length);
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse+original.charAt(i);
			//System.out.println(reverse);
		}
			if(original.equals(reverse))
			{
				System.out.println(" The number is palindrome");
			}
			else
		System.out.println("The number is NOT  palindrome");
			
				
			}
		}
		
	


