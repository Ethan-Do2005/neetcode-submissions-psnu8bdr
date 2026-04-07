class Solution {
    private int ROWS, COLS;
    
    public int numIslands(char[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;
        int count = 0;

        for(int r = 0; r < ROWS; r++ ){
            for(int c = 0; c < COLS; c++){
                if(grid[r][c] == '1'){
                    Check(grid, r, c);
                    count++;
                }
            }
        }

        return count;
    }

    private void Check(char[][] grid, int r, int c){
        if( r < 0 || c < 0 ||
            r >= ROWS || c >= COLS ||
            grid[r][c] == '0'){
                return;
            }

        grid[r][c] = '0';

        Check(grid, r + 1, c);
        Check(grid, r - 1, c);
        Check(grid, r, c + 1);
        Check(grid, r, c - 1);
    }

}
/*
My idea: 
two nested loop for multi dimension array to check each cell

helper method(grid, int r, int c, int i)

    if for unsatisfy cases
        return
    
    mark [][] = true;
    boolean to check 4 direction

    return true;
*/
