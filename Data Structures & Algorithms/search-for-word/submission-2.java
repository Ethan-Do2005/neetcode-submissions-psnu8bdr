class Solution {
    private int ROWS, COLS;
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        visited = new boolean[ROWS][COLS];
 
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(isCheckBoard(board, word, i, j, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isCheckBoard(char[][] board, String word, int r, int c, int i){
        if(i == word.length()){
            return true;
        }

        if( r < 0 || c < 0 || 
            r >= ROWS || c >= COLS ||
            board[r][c] != word.charAt(i) || 
            visited[r][c]){
            return false;
        }

        visited[r][c] = true;

        boolean res =   
                isCheckBoard(board, word, r + 1, c, i + 1) ||
                isCheckBoard(board, word, r - 1, c, i + 1) ||
                isCheckBoard(board, word, r, c + 1, i + 1) ||
                isCheckBoard(board, word, r, c - 1, i + 1);

        visited[r][c] = false;

        return res;
    }
}
/*
My idea: 
Go throgh its word 
    If word == first character of word
        while
            if hori vs ver is also = other character or not 


Backtrack for logic whenw while
helper method 
    if contains 
*/