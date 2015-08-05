public class Solution {

	 public int GetUglyNumber_Solution(int index) {
		 if(index<=0) return 0;
		 int[] list = new int[index];
		 int index2 = 0;
		 int index3 = 0;
		 int index5 = 0;
		 int next = 1;
		 list[0] = 1;
		 while(next<index){
			 int min = Min(list[index2]*2,list[index3]*3,list[index5]*5);
			 list[next] = min;
			 while(list[index2]*2<=min) index2=index2+1;
			 while(list[index3]*3<=min)  index3=index3+1;
			 while(list[index5]*5<=min)  index5=index5+1;
			 next = next+1;
		 }
	       return list[next-1];
	    }
	 
	 int Min(int number1,int number2,int number3) {
		 int min = number1<number2?number1:number2;
		 return   min<number3?min:number3;
	 }
	 
	  public static void main(String[] args) {
			Solution solution = new Solution();
			System.out.println(solution.GetUglyNumber_Solution(5));

		}
	  

}
