




/*
  A Vampire Number is a positive integer greater than 99, that rearranged in all of its possible digits permutations, 
  with every permutation being split into two parts, is equal to the product of at least one of its permutations.

  * If the number has an even quantity of digits, left and right parts will have the same length in every permutation;
  * If the number has an odd quantity of digits and at least three digits, 
    the left and right parts will present different lengths for every possible permutation, alternating between them in the range +1 and -1.
  
  Given a positive integer n, implement a function that returns the type of n as a string:

  * 'Normal Number' if n is lower than 100 or if no permutations return a product of their parts equal to n.
  * 'Pseudovampire' if n it is a Vampire with an odd quantity of digits.
  * 'True Vampire' if n it is a Vampire with an even quantity of digits.
  
  Examples  :
  isVampire(1260) ➞ "True Vampire"
  // Has an even number of digits and is greater than 99)
  // Permutations:
  // 12 * 60 = 720
  // 16 * 20 = 320
  // 10 * 26 = 260
  // 21 * 60 = 1260

  isVampire(126) ➞ "Pseudovampire"
  // Has an odd number of digits and is greater than 99
  // Permutations:
  // 12 * 6 = 72
  // 1 * 26 = 26
  // 21 * 6 = 126

  isVampire(67) ➞ "Normal Number"
  // Is lower than 100
  // Permutations:
  // 6 * 7 = 7 * 6 = 42

  Notes :
  Trivially, a number from 1 to 99 is a Normal Number by the definitions: 
  a single-digit number can't be split into two parts, and the product of the permutated two digits of a number will always be lower than the number itself. 
  
  26-January-2023
*/

import java.util.*;
public class Challenge {
  public static String isVampire(int number) {
    String[] arrayNumber = String.valueOf(number).split("");
    if (number < 100) {
			return "Normal Number";
		}
		int[] sizeCombinations = new int[arrayNumber.length];
		List<String> permutations = getPermutations(sizeCombinations, arrayNumber);
		for (String current : permutations) {
			if (arrayNumber.length % 2 == 0) {
				int left = Integer.parseInt(current.substring(0, current.length() / 2));
				int right = Integer.parseInt(current.substring(current.length() / 2));
				if (left * right == number){
					return "True Vampire";
				}
			} else {
				int leftOneMore = Integer.parseInt(current.substring(0, current.length() / 2 + 1));
				int rightOneMore = Integer.parseInt(current.substring(current.length() / 2 + 1));
				if (leftOneMore * rightOneMore == number){
					return "Pseudovampire";
				}
			}
		}
		return "Normal Number";
	}
	
	private static List<String> getPermutations(int[] sizeCombinations, String[] arrayNumber) {
		List<String> permutations = new ArrayList<>();
		boolean finish = false;
		do {
			if (noRepeatCombinations(sizeCombinations)) {
				StringBuilder stringBuilder = new StringBuilder();
				for (int combination : sizeCombinations) {
					stringBuilder.append(arrayNumber[combination]);
				}
				permutations.add(stringBuilder.toString());
			}
			for (int i = sizeCombinations.length - 1; i >= 0; i--) {
				sizeCombinations[i]++;
				if (sizeCombinations[0] == arrayNumber.length) {
					finish = true;
				}
				if (sizeCombinations[i] == arrayNumber.length) {
					sizeCombinations[i] = 0;
				} else {
					break;
				}
			}
		} while (!finish);
		return permutations;
	}
	
	private static boolean noRepeatCombinations(int[] sizeCombinations) {
		for (int i=0; i<sizeCombinations.length; i++)
			for (int j=0; j<sizeCombinations.length; j++)
				if (j!=i && sizeCombinations[i]==sizeCombinations[j])
					return false;
		return true;
	}
}
