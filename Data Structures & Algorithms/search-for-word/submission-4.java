class Solution {
    private int ROWS;
    private int COLS;
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        visited = new boolean[ROWS][COLS];

        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(checkChar(board, word, r, c, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean checkChar(char[][] board, String word, int row, int col, int i){
        if(i == word.length()){
            return true;
        }

        if( row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length ||
            board[row][col] != word.charAt(i) ||
            visited[row][col]){
                return false;
            }
        
        visited[row][col] = true;
        boolean res  =  checkChar(board, word, row + 1, col, i+1) ||
                        checkChar(board, word, row - 1, col, i+1) ||
                        checkChar(board, word, row, col + 1, i+1) ||
                        checkChar(board, word, row, col - 1, i+1);

        visited[row][col] = false;
        return res;
    }
}
/*
Mark all of board is false

Helper method using backtracking
    if it go throught all word return true
    if condtion to check unsatisfy 

    mark each index = true
    boolean res = 4 direction from that index
    mark each index = false;
    return res
*/
