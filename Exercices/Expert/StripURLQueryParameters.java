




/*
  Create a function that takes a URL (string), removes duplicate query parameters and parameters specified within the 2nd argument (which will be an optional array).

  Examples
  stripUrlParams("https://jm.com?a=1&b=2&a=2") ➞ "https://jm.com?a=2&b=2"

  stripUrlParams("https://jm.com?a=1&b=2&a=2", ["b"]) ➞ "https://jm.com?a=2"

  stripUrlParams("https://jm.com", ["b"]) ➞ "https://jm.com"
  Notes
  The 2nd argument paramsToStrip is optional.
  paramsToStrip can contain multiple params.

  23-January-2023
*/

import java.util.HashMap;

public class Challenge {
  public static String stripUrlParams(String url, String[] paramsToStrip) {
    if (!url.contains("?")) return url;
    
    String[] surl = url.split("\\?");
		String[] params = surl[1].split("\\&");
		HashMap<String, String> dict = new HashMap<>();
		
    for (String v : params) {
      dict.put(v.substring(0, 1), v);
    }
    
    if (paramsToStrip != null) for (String k : paramsToStrip) {
      dict.remove(k);
    }
    return surl[0] + "?" + String.join("&", dict.values());
  }
}
