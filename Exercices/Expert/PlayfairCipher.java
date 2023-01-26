




/*
  The Playfair cipher is a substitution cipher that uses digraphs (pairs of letters) instead of single letters, and makes use of symmetrical encryption.

  There are some variations on the rules of encipherment. One version of the cipher rules is outlined below:

  A 5x5 Polybius square is constructed, deranged with a keyword.
  keyword = python
  First, fill in the keyword at the top of the grid, omitting any duplicates (3rd example's keyword has two occurrences of "h". The second one should be omitted).

  P	Y	T	H	O
  N				
  
  Next, fill in the rest of the slots with the leftover letters of the alphabet that are not in the keyword. Classically, "I" and "J" share a slot (some people elect to omit "Q", "V", or "Z" instead).

  P	Y	T	H	O
  N	A	B	C	D
  E	F	G	I/J	K
  L	M	Q	R	S
  U	V	W	X	Z
  Remove spaces and punctuation from the message to be enciphered. Then break it up into two-letter chunks (digraphs):
  
  message = "Tomorrow we attack."
  message = "tomorrowweattack"
  message = "to mo rr ow we at ta ck"
  
  Digraphs must have two distinct letters. If any digraph consists of the same letter, insert an "x" between them and shift the pairings to the right. 
  Repeat as necessary until all double letters are eliminated. If the resulting message has an odd number of letters, add an "x" to the end.
  
  message = "to mo rx ro ww ea tt ac k"
  
  Note how shifting the pairings rightward after inserting an 'x' after the first 'r' has created two more double letter digraphs. Correct them sequentially.

  message = "to mo rx ro wx we at ta ck"
  
  This insertion corrected both double letter digraphs, and evened out the message length. No more changes are necessary.

  Encipher each digraph into a different digraph by following these 3 rules of encipherment:
  If the two letters are on the same row, as is the case for the first digraph "to", replace each letter with the letter to its right, wrapping around to the beginning of the row if necessary.
  
  to -> hp
  
  If the two letters are on the same column, as in the third digraph "rx", replace each letter with the letter beneath it, wrapping around to the top if necessary
  
  rx -> xh
  
  If the two letters have dissimilar rows and columns, as in the second digraph "mo", visualise a rectangle with these letters at opposite vertices, then find the other two vertices. Replace each letter with the vertex sharing its row. The original letters are rendered in bold below. The cipher letters are italicised and bolded.

  P	Y	T	H	O
  N	A	B	C	D
  E	F	G	I/J	K
  L	M	Q	R	S
  U	V	W	X	Z
  
  mo -> sy
  "to mo rx ro wx we at ta ck" -> "hp sy xh sh xz ug by yb di"
  
  Create a function that takes two strings — a plaintext message or ciphertext str, and a keyword — and returns the corresponding ciphertext or deciphered plaintext (without spaces and with "x" in odd places as appropriate).

  Examples
  playfair("Tomorrow we attack.", "python") ➞ "HPSYXHSHXZUGBYYBDI"

  playfair("HPSYXHSHXZUGBYYBDI", "python") ➞ "TOMORXROWXWEATTACK"

  playfair("MYDZABIFBMENFEQAAE", "rhythm") ➞ "THEXEAGLEHASLANDED" 
  
  26-January-2023
*/

public class Challenge {
  public static String playfair(String str, String keyword) {
    //Step 1
    keyword = keyword.concat("abcdefghiklmnopqrstuvwxyz").replaceAll("(.)(?=(.*))(?<=(?=\\1.*?\\1\\2$).+)", "");
    String str2 = "", str3 = "";
    if (str.replaceAll("\\W", "").equals(str)) {
      keyword = keyword.toUpperCase();
      for (int i = 0; i < str.length(); i += 2) {
        int index1 = keyword.indexOf(str.charAt(i));
        int index2 = keyword.indexOf(str.charAt(i + 1));
        if (index1 / 5 == index2 / 5) {
          str3 += "" + keyword.charAt(index1 - 1 + (index1 - 1 < index1 / 5 * 5 ? 5 : 0))
            + keyword.charAt(index2 - 1 + (index2 - 1 < index2 / 5 * 5 ? 5 : 0));
        } else if (index1 % 5 == index2 % 5) {
          str3 += "" + keyword.charAt(index1 - 5 + (index1 - 5 < 0 ? 25 : 0))
            + keyword.charAt(index2 - 5 + (index2 - 5 < 0 ? 25 : 0));
        } else {
          str3 += "" + keyword.charAt(index2 + index1 / 5 * 5 - index2 / 5 * 5)
            + keyword.charAt(index1 - index1 / 5 * 5 + index2 / 5 * 5);
        }
      }
    } else {
      //Step 2
      str = str.replaceAll("\\W", "").toLowerCase();
      int j = 0;
      for (int i = 0; i + j < str.length(); i += 2) {
        //Step 3
        str2 += str.charAt(i + j);
        if (i + j + 1 != str.length()) {
          if (str.charAt(i + j) != str.charAt(i + j + 1)) str2 += str.charAt(i + j + 1);
          else {
            str2 += "x";
            j--;
          }
        } else str2 += "x";
        //Step 4
        int index1 = keyword.indexOf(str2.charAt(i));
        int index2 = keyword.indexOf(str2.charAt(i + 1));
        if (index1 / 5 == index2 / 5) {
          str3 += "" + keyword.charAt((index1 + 1 - index1 / 5 * 5) % ((index1 / 5 + 1) * 5 - index1 / 5 * 5) + index1 / 5 * 5)
            + keyword.charAt((index2 + 1 - index2 / 5 * 5) % ((index2 / 5 + 1) * 5 - index2 / 5 * 5) + index2 / 5 * 5);
        } else if (index1 % 5 == index2 % 5) {
          str3 += "" + keyword.charAt((index1 + 5) % 25)
            + keyword.charAt((index2 + 5) % 25);
        } else {
          str3 += "" + keyword.charAt(index2 + index1 / 5 * 5 - index2 / 5 * 5)
            + keyword.charAt(index1 - index1 / 5 * 5 + index2 / 5 * 5);
        }
      }
    }
    return str3.toUpperCase();
  }
}
