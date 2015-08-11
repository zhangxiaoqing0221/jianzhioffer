
public class Solution {

	public String LeftRotateString(String str,int n) {
	  if(str.length()<n) return "";
	  String s1 = str.substring(0,n);
	  String s2 = str.substring(n, str.length());
	  StringBuilder sb = new StringBuilder();
	  sb.append(s2);
	  sb.append(s1);
	 return sb.toString();
	     
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.LeftRotateString("abcXYZdef",3));

	}

}
