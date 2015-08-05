import java.util.HashMap;

public class Solution {
	public int FirstNotRepeatingChar(String str) {
		if(str.length()==0||str==null) return -1;
		HashMap<Character,Integer>  map = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))==1) return i;
		}
        return -1;
    }
	  public static void main(String[] args) {
			Solution solution = new Solution();
			System.out.println(solution.FirstNotRepeatingChar("aabccdbd"));

		}
}
