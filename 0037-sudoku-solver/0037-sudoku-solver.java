class Solution {
    boolean solve(char [][]board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.'){
                    for(char c='1'; c<='9'; c++){
                        if(isValid(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board)==true)return true;
                            else{
                                board[i][j]='.';
                            }
                        }
                    }return false;
                }
            }
        }
        return true;//if sudoku is already filled
    }
    boolean isValid(char[][]board, int row, int col,char ch){
        for(int i=0; i<9; i++){
            if(board[row][i]==ch)return false;//row check
            if(board[i][col]==ch)return false;//col check
            int r=3*(row/3)+(i/3);
            int c=3*(col/3)+(i%3);
            if(board[r][c]==ch)return false;
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}