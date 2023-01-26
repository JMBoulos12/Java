




/*
  The nesting of arrays can be viewed indirectly as curves and barriers of the real data embedded in arrays, 
  thus, defeats the very purpose of directly accessing them thru indexes and slices. 
  Write a recursive function to flatten those curves (i.e. level, iron, compress, raze, topple) and expose those data as a single array other than an array of arrays.

  Examples  :
  flatten(["Tesh", 121317, ["Love", "of", ["my", ["life", ["and", "my", ["world"], "entirely"]]]]])
  ➞ ["Tesh", 121317, "Love", "of", "my", "life", "and", "my", "world", "entirely"]

  flatten([[[[[["direction"], [372], ["one"], [[[[[["Era"]]]], "Sruth", 3337]]], "First"]]]])
  ➞ ["direction", 372, "one", "Era", "Sruth", 3337, "First"]

  flatten([[4666], [5394], [466], [[["Saskia", [[[[["DXTD"]], "Lexi"]]]]]]])
  ➞ [4666, 5394, 466, "Saskia", "DXTD", "Lexi"]

  flatten([[696], ["friend"], ["power"], [[[["Marcus"]]]], ["philus"]])
  ➞ [696, "friend", "power", "Marcus", "philus"]

  flatten([[["deep"], [[["ocean"]]], [["Marge"]], ["rase", 876]]])
  ➞ ["deep", "ocean", "Marge", "rase", 876]
  
  Notes :
  Every array has at least one element.
  You are expected to solve this challenge via a recursive approach. 
  
  26-January-2023
*/

import java.util.*;
public class MultidimensionArrays {
	private static ArrayList<Object> o;
	public static Object[] flatten(Object[] a) {
		if (o==null) {
			o=new ArrayList<>();
			flatten(a);
			Object[] q=o.toArray();
			o=null;
			return q;
		}
		for (Object e:a)
			if (e instanceof Object[]) flatten( (Object[])e );
			else o.add(e);
		return null;
	}
}
