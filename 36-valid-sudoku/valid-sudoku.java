class Solution {
        // boolean ans=true;

    public boolean isValidSudoku(char[][] board) {
          int n=board.length;
        return findSol(board,0,n);
    }
    public static boolean isValid(int row,int col,char[][] board,int n){
              char target=board[row][col];
           
        // row check
        for (int j = 0; j < n; j++) {
            if (j != col && board[row][j] == target) {
                return false;
            }
        }

        // column check
        for (int i = 0; i < n; i++) {
            if (i != row && board[i][col] == target) {
                return false;
            }
        }

        // 3x3 box check
        int rowstart = (row / 3) * 3;
        int colstart = (col / 3) * 3;

        for (int i = rowstart; i < rowstart + 3; i++) {
            for (int j = colstart; j < colstart + 3; j++) {
                if ((i != row && j != col) && board[i][j] == target) {
                    return false;
                }
            }
        }

        return true;
    }

      public static boolean findSol(char[][] board,int row, int n){
             if(row==n){
                return true;
             }

             for(int i=0;i<n;i++){
                   if(board[row][i]=='.' || isValid(row,i,board,n)){
                       continue;
                   }else{
                       return false;
                   }
             }

            return  findSol(board,row+1,n);
      }
}
