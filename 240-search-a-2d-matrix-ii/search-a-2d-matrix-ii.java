class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          boolean ans=false;

            int stRow=0,endCol=matrix[0].length-1;

            while(stRow<=matrix.length-1 && endCol>=0){
                  
                  if(matrix[stRow][endCol]==target){
                      return true;
                  }else if(matrix[stRow][endCol]>target){
                      endCol--;
                  }else{
                      stRow++;
                  }
            } 

            return ans;  
    }
}