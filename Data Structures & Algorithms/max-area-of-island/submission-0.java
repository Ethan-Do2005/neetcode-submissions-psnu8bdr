class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid[0].length == 0 || grid.length ==0){
            return 0;
        }
        int maxCount = 0;
        for(int i =0; i< grid.length;i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    maxCount = Math.max(maxCount, dfs(grid,i,j));
                }
            }
        }

        return maxCount;
    }

    private int dfs(int[][] grid, int i, int j){
        if(i<0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        return 1+
        + dfs(grid, i+1,j)
        + dfs(grid, i-1,j)
        + dfs(grid, i,j+1)
        + dfs(grid, i,j-1);
    }
}
/*
Iterative each i, j 
    if it visit 1
        dfs(i,j, 0);
        if(count > = Maxcount){
            Maxcount = count;
        }


    return count;

dfs(i,j)
    check base case

count+= 1;

dfs(i+1,j);
dfs(i-1,j);
dfs(j+1,i);
dfs(j-1,i);
*/