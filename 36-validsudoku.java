class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                for(int k=0;k<9;k++){
                    if(k!=j && board[i][j]==board[i][k])return false;
                }
                for(int k=0;k<9;k++){
                    if(k!=i && board[k][j]==board[i][j])return false;
                }
                int x = i;
                while(x%3!=0)x--;
                int y = j;
                while(y%3!=0)y--;
                for(int m=x;m<x+3;m++){
                    for(int n=y;n<y+3;n++){
                        if(m!=i && n!=j &&board[m][n]==board[i][j])return false;
                    }
                }
            }
        }
        return true;
    }
}
