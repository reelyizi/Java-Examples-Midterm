package testP;
import java.util.*;

public class testM {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Count letters by user input		
		System.out.println("Enter a message");
		String string = scanner.nextLine();
		CountLetters(string);
		
		//Read number by user 
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		System.out.println("Reverse of given number: " + ReverseGivenNumber(number));
		System.out.println("Palindrome: " + IsPalindrome(number));
		
		//Estimate pi number
		System.out.println("Estimate pi number");
		int loop = scanner.nextInt();
		EstimatePi(loop);
	}
	
	public static void CountLetters(String string) {
		
		int i=0, totalLength = string.length();
		char[] _string = string.toCharArray();
		while (i<string.length()) {
			if(_string[i] == ' ') {
				totalLength--;
			}
			i++;
		}
		System.out.println(totalLength);
	}
	
	public static int ReverseGivenNumber(int number) {
		char[] numbers = Integer.toString(number).toCharArray();
		char[] reversedNumbers = new char[numbers.length];
		
		int counter = numbers.length;
		while (counter > 0) {
			reversedNumbers[numbers.length - counter] = numbers[counter-- - 1];
		}

		return Integer.parseInt(String.valueOf(reversedNumbers));
	}
	
	public static boolean IsPalindrome(int number) {
		char[] numbers = Integer.toString(number).toCharArray();
		char[] reversedNumbers = new char[numbers.length];
		
		int counter = numbers.length;
		while (counter > 0) {
			reversedNumbers[numbers.length - counter] = numbers[counter -1];
			counter--;
		}
		
		counter = 0;
		
		while (counter < numbers.length) {
			if(numbers[counter] != reversedNumbers[counter])
				return false;
			
			counter++;
		}
		
		return true;
	}

	public static void EstimatePi(int i) {
		double sum = 0, pow = -1;
		for (int j = 1; j <= i; j++) {
			
			if(j%2 == 0)
				pow = 1;
			else
				pow = -1;
			
			sum += (pow / ((2*j)-1));
			if(j==1 || j%100 == 0 || j == i) {
				System.out.println("Current loop: " + j + " pi number: " + (-sum * 4));
			}
		}	
	}
}
