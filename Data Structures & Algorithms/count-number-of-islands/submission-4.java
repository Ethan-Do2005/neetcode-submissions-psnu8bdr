class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];

        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(grid[r][c] == '1' && !visited[r][c]){
                    count++;
                    dfs(grid, visited, r, c);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, boolean[][] visited, int r, int c){
        //Base case size of 2D array
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length){
            return;
        }
        
        //Base Case logic
        if(grid[r][c] == '0' || visited[r][c] == true){
            return;
        }

        visited[r][c] = true;

        dfs(grid, visited, r + 1, c);
        dfs(grid, visited, r - 1, c);
        dfs(grid, visited, r, c + 1);
        dfs(grid, visited, r, c - 1);
    }
}
