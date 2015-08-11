
public class Solution {
	public String ReverseSentence(String str) {
		if(str.length()==0) return str;
		if(str.trim().length()==0) return str;
		String[] strs = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = strs.length-1;i>0;i--) {
			sb.append(strs[i]+" ");
		}
		sb.append(strs[0]);
		return sb.toString();
        
    }
	
	

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println("*****"+solution.ReverseSentence("student. a am I")+"***");

	}

}
