package coding.javaprogrammes.interviews;

import java.util.Scanner;

public class isPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,temp;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		System.out.println(num);
		//sc.close();
		for(int i=2; i<=num/2; i++)
		{
			temp = num%i;
			if(temp == 0) {
				isPrime =false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num + "Prime number");
		}
		else
		{
			System.out.println(num + "Not Prime number");
		}
		
	}

}
