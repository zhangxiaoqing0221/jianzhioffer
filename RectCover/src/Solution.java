public class Solution {
    public int RectCover(int target) {
        if(target==1||target==2) return target;
        int numberOne = 1;
        int numberTwo = 2;
        int result = 0;
        for(int i=2;i<target;i++) {
            result = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = result;
        }
        return result;
 
    }
}