public class Solution {
	  public int StrToInt(String str) {
	        if(str.length()==0|| str==null||str.trim().length()==0) return 0;
	        long num = 0;
	        boolean minus = false;
	        int i=0;
	        str = str.trim();
	        if(str.charAt(i)=='-')  { 
	        	minus = true;
	        	i++;
	        }else if(str.charAt(i)=='+') {
	        	i++;
	        }
	        if(str.length()>1) {
	        	num = StrToIntCore(str,minus,i);
	        }
	        
		  return (int)num;
	    }
	  
	  long StrToIntCore(String str,boolean minus,int index) {
		  long num = 0;
		  for(int i=index;i<str.length();) {
			  if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				  int flag = minus ? -1:1;
				  num = num *10 + flag*(str.charAt(i)-'0');
				  if(!minus&&num>Integer.MAX_VALUE||minus&&num<Integer.MIN_VALUE) {
					  num = 0;
					  break;
				  }
				  i++;
			  }else {
				  num = 0;
				  break;
			  }
		  }
		  return num;
	  }

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.StrToInt("12345"));

	}

}
