public class Solution {
    public boolean Find(int [][] array,int target) {
        int columns = array[0].length;
         int rows  = array.length;
         int row = 0;
         int column = columns-1;
         while(row<rows&&column>=0) {
             if(target==array[row][column]) return true;
             else if(target>array[row][column]) row++;
             else column--;
         }
         return false;
 
    }
}